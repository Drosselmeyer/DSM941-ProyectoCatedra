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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import sv.edu.udb.proyectocatedraasb.R

@Composable
fun InicioDeSesion(modifier: Modifier = Modifier, navController: NavHostController) {
    var usuario by remember { mutableStateOf(TextFieldValue()) }
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
        BasicTextField(
            value = usuario,
            onValueChange = { newText ->
                usuario = newText
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
            if (usuario.text.isEmpty()) {
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
                .height(35.dp)
                .width(174.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ){
            if (password.text.isEmpty()) {
                Text(
                    text = "Ingrese contraseña",
                    color = Color(0xFFBE7938)
                )
            }
        }
        Button(
            onClick = { navController.navigate("SplashScreen") },
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .width(174.dp)
                .background(
                    color = Color(0xFFF7BF6C),
                    shape = RoundedCornerShape(4.dp)
                )
        ) {
            // You can customize the button label or icon here
            Text(text = "Inicia Sesión", color = Color(0xFFBE7938) )
        }
       Text(
            text = "ó",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
    }
    Button(
        onClick = { navController.navigate("RegistroUsuario") },
        modifier = Modifier
            .fillMaxWidth()
            .height(35.dp)
            .width(174.dp)
            .background(
                color = Color(0xFFF7BF6C),
                shape = RoundedCornerShape(4.dp)
            )
    ) {
        // You can customize the button label or icon here
        Text(text = "Registrate", color = Color(0xFFBE7938) )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun InicioDeSesionPreview() {
    val navController = rememberNavController()
    InicioDeSesion(Modifier, navController)
}

annotation class Preview(val widthDp: Int, val heightDp: Int)
