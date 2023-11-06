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
fun RegistroUsuario(modifier: Modifier = Modifier, navController: NavHostController) {
    var nombre by remember { mutableStateOf(TextFieldValue()) }
    var correo by remember { mutableStateOf(TextFieldValue()) }
    var dui by remember { mutableStateOf(TextFieldValue()) }
    var parentesco by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }

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
        Text(
            text = "Registro de Usuario ",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
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
            value = correo,
            onValueChange = { newText ->
                correo = newText
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
                .height(35.dp)
                .width(174.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (dui.text.isEmpty()) {
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
                .height(35.dp)
                .width(174.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (parentesco.text.isEmpty()) {
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
                .height(35.dp)
                .width(174.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (password.text.isEmpty()) {
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
                .height(35.dp)
                .width(174.dp)
                .background(
                    color = Color(0xFFF7BF6C),
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