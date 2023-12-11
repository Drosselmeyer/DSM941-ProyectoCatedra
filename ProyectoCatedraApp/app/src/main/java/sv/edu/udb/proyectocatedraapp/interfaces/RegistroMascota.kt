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
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import sv.edu.udb.proyectocatedraasb.R

@Composable
fun RegistroMascota(modifier: Modifier = Modifier, navController: NavHostController) {
    var nombre by remember { mutableStateOf(TextFieldValue()) }
    var edad by remember { mutableStateOf(TextFieldValue()) }
    var tipo by remember { mutableStateOf(TextFieldValue()) }
    var raza by remember { mutableStateOf(TextFieldValue()) }
    var duenio by remember { mutableStateOf(TextFieldValue()) }
    var telefono by remember { mutableStateOf(TextFieldValue()) }

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
            value = edad,
            onValueChange = { newText ->
                edad = newText
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
            if (edad.text.isEmpty()) {
                Text(
                    text = "Edad",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = tipo,
            onValueChange = { newText ->
                tipo = newText
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
            if (tipo.text.isEmpty()) {
                Text(
                    text = "Tipo de Mascota",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = raza,
            onValueChange = { newText ->
                raza = newText
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
            if (raza.text.isEmpty()) {
                Text(
                    text = "Raza",
                    color = Color(0xFFBE7938)
                )
            }
        }
        BasicTextField(
            value = duenio,
            onValueChange = { newText ->
                duenio = newText
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
            if (duenio.text.isEmpty()) {
                Text(
                    text = "Dueño",
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
                    text = "Telefono del Dueño",
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
private fun RegistroMascotaPreview() {
    val navController = rememberNavController()
    RegistroMascota(Modifier,navController)
}

class MascotaViewModel : ViewModel() {
    private val _clients = mutableListOf<String>()
    val clients: List<String> get() = _clients

    init {
        fetchData()
    }

    private fun fetchData() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = getWebServiceData("localhost:8080/mascotas.php")
            val jsonArray = JSONArray(response)
            for (i in 0 until jsonArray.length()) {
                val jsonObject = jsonArray.getJSONObject(i)
                val clientName = jsonObject.getString("mascotas")
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