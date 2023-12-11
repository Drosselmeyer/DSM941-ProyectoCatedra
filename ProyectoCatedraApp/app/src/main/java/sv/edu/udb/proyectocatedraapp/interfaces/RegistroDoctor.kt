package sv.edu.udb.proyectocatedraasb.interfaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.*
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONArray
import sv.edu.udb.proyectocatedraasb.R
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

@Composable
fun RegistroDoctor(modifier: Modifier = Modifier, navController: NavHostController) {
    var nombre by remember { mutableStateOf(TextFieldValue()) }
    var correo by remember { mutableStateOf(TextFieldValue()) }
    var dui by remember { mutableStateOf(TextFieldValue()) }
    var telefono by remember { mutableStateOf(TextFieldValue()) }
    var genero by remember { mutableStateOf(TextFieldValue()) }

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
            text = "Registro de Veterinario/a ",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxWidth()
                .rotate(degrees = 0.49f))
        BasicTextField(
            value = nombre,
            onValueChange = { newText ->
                nombre = newText
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (nombre.text.isEmpty()) {
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
                .height(50.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (correo.text.isEmpty()) {
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
                .height(50.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (dui.text.isEmpty()) {
                Text(
                    text = "DUI",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = telefono,
            onValueChange = { newText ->
                telefono = newText
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (telefono.text.isEmpty()) {
                Text(
                    text = "Telefono",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = genero,
            onValueChange = { newText ->
                genero = newText
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(174.dp)
                .padding(all = 8.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (genero.text.isEmpty()) {
                Text(
                    text = "Genero",
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
            Text(text = "Registrar", color = Color(0xFFBE7938) )
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun RegistroDoctorPreview() {
    val navController = rememberNavController()
    RegistroDoctor(Modifier,navController)
}

class DoctorViewModel : ViewModel() {
    private val _clients = mutableListOf<String>()
    val clients: List<String> get() = _clients

    init {
        fetchData()
    }

    private fun fetchData() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = getWebServiceData("localhost:8080/doctores.php")
            val jsonArray = JSONArray(response)
            for (i in 0 until jsonArray.length()) {
                val jsonObject = jsonArray.getJSONObject(i)
                val clientName = jsonObject.getString("doctores")
                _clients.add(clientName)
            }
        }
    }

    private fun getWebServiceData(urlString: String): String {
        val url = URL(urlString)
        val connection = url.openConnection() as HttpURLConnection
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