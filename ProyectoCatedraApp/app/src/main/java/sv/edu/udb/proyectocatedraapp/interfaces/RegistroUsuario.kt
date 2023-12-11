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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.Arrangement.Center
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

@Composable
fun RegistroUsuario(modifier: Modifier = Modifier, navController: NavHostController) {
    var nombre by remember { mutableStateOf("") }
    var correo by remember { mutableStateOf("") }
    var dui by remember { mutableStateOf("") }
    var parentesco by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Center
        /*.requiredWidth(width = 360.dp)
        .requiredHeight(height = 800.dp)
        .clip(shape = RoundedCornerShape(30.dp))
        .rotate(degrees = 0.25f)
        .background(color = Color.White)*/
    ){
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
        Text(
            text = "Registro de Usuario ",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxWidth()
                .rotate(degrees = 0.49f)
                .padding(all = 8.dp))
        BasicTextField(
            value = nombre,
            onValueChange = { newText ->
                nombre = newText
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
            if (nombre.isEmpty()) {
                Text(
                    text = "Nombre",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = correo,
            onValueChange = { newText ->
                correo = newText
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
            if (correo.isEmpty()) {
                Text(
                    text = "Email",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = dui,
            onValueChange = { newText ->
                dui = newText
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
            if (dui.isEmpty()) {
                Text(
                    text = "Ingrese usuario",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = parentesco,
            onValueChange = { newText ->
                parentesco = newText
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
            if (parentesco.isEmpty()) {
                Text(
                    text = "Parentesco de la mascota",
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
                    text = "Contraseña",
                    color = Color(0xFFBE7938)
                )
            }
        }
        Button(
            onClick = { navController.navigate("Menu") },
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
            Text(text = "Registrarse", color = Color(0xFFBE7938) )
        }
    }

}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun RegistroUsuarioPreview() {
    val navController = rememberNavController()
    RegistroUsuario(Modifier, navController)
}
