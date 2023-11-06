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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import sv.edu.udb.proyectocatedraasb.R
@Composable
fun RegistroMascota(modifier: Modifier = Modifier, navController: NavHostController) {
    var nombre by remember { mutableStateOf(TextFieldValue()) }
    var edad by remember { mutableStateOf(TextFieldValue()) }
    var tipo by remember { mutableStateOf(TextFieldValue()) }
    var raza by remember { mutableStateOf(TextFieldValue()) }
    var duenio by remember { mutableStateOf(TextFieldValue()) }
    var telefono by remember { mutableStateOf(TextFieldValue()) }

    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .rotate(degrees = 0.25f)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-46).dp,
                    y = (-20).dp)
                .requiredWidth(width = 443.dp)
                .requiredHeight(height = 840.dp)
                .rotate(degrees = 0.25f))
        BasicTextField(
            value = nombre,
            onValueChange = { newText ->
                nombre = newText
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .width(174.dp)
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
                .height(35.dp)
                .width(174.dp)
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
                .height(35.dp)
                .width(174.dp)
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
                .height(35.dp)
                .width(174.dp)
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
                .height(35.dp)
                .width(174.dp)
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
                .height(35.dp)
                .width(174.dp)
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
                .height(35.dp)
                .width(174.dp)
                .background(
                    color = Color(0xFFF7BF6C),
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