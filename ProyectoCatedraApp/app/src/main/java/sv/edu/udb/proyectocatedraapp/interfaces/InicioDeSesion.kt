package sv.edu.udb.proyectocatedraasb.interfaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.*
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import sv.edu.udb.proyectocatedraasb.R

class LoginViewModel : ViewModel() {
    private lateinit var navController: NavController;

    fun performLogin(username: String, password: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = performLoginRequest(username, password)
            // Handle the response here (e.g., validation, navigation)
            val jsonResponse = JSONObject(response)
            val loginSuccess = jsonResponse.getBoolean("login_success")
            if (loginSuccess) {
                navController.navigate("menu");

            } else {
                navController.navigate("login");
            }
        }
    }

    private fun performLoginRequest(username: String, password: String): String {
        val url = URL("localhost:8080/login.php")
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        connection.doOutput = true

        val postData = "username=$username&password=$password"
        val writer = OutputStreamWriter(connection.outputStream)
        writer.write(postData)
        writer.flush()

        val response = StringBuilder()
        try {
            val reader = BufferedReader(InputStreamReader(connection.inputStream))
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                response.append(line)
            }
        } finally {
            connection.disconnect()
        }
        return response.toString()
    }
}

@Composable
fun InicioDeSesion(modifier: Modifier = Modifier, navController: NavHostController,loginViewModel: LoginViewModel = viewModel()) {
    var usuario by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
            /*.requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .rotate(degrees = 0.25f)
            .background(color = Color.White)*/
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .offset(x = (0).dp,
                    y = (0).dp)
                .requiredWidth(width = 200.dp)
                .requiredHeight(height = 200.dp)
                .rotate(degrees = 0.25f)
                .size(100.dp,50.dp)
                .padding(all = 8.dp),
            contentScale = ContentScale.Inside
        )
        BasicTextField(
            value = usuario,
            onValueChange = { newText ->
                usuario = newText
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
                .align(Alignment.CenterHorizontally)
        ){
            if (usuario.isEmpty()) {
                Text(
                    text = "Ingrese usuario",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = password,
            onValueChange = { newText ->
                password = newText
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (password.isEmpty()) {
                Text(
                    text = "Ingrese contraseña",
                    color = Color(0xFFBE7938)
                )
            }
        }
        Button(
            onClick = {
                loginViewModel.performLogin(usuario, password)
                navController.navigate("SplashScreen") },
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF),
                    shape = RoundedCornerShape(4.dp)
                )
        ) {
            // You can customize the button label or icon here
            Text(text = "Inicia Sesión", color = Color(0xFFBE7938) )
        }
       Button(
            onClick = { navController.navigate("RegistroUsuario") },
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF),
                shape = RoundedCornerShape(4.dp)
        )

        ) {
            Text(text = "Registrate", color = Color(0xFFBE7938) )
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun InicioDeSesionPreview() {
    val navController = rememberNavController()
    InicioDeSesion(Modifier, navController)
}

annotation class Preview(val widthDp: Int, val heightDp: Int)
