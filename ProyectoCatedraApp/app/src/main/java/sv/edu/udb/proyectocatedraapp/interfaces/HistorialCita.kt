package sv.edu.udb.proyectocatedraasb.interfaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.*
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import sv.edu.udb.proyectocatedraasb.R

@Composable
fun HistorialCita(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .rotate(degrees = 0.25f)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.diseosinttulo61),
            contentDescription = "Diseo sin ttulo (6) 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-46).dp,
                    y = (-20).dp)
                .requiredWidth(width = 443.dp)
                .requiredHeight(height = 840.dp)
                .rotate(degrees = 0.25f))
        Image(
            painter = painterResource(id = R.drawable.rectangle1),
            contentDescription = "Rectangle 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 41.dp,
                    y = 63.dp)
                .requiredWidth(width = 297.dp)
                .requiredHeight(height = 212.dp)
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Inicia Sesión",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Ingrese Usuario",
            color = Color(0xffbe7938),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Ingrese Contraseña",
            color = Color(0xffbe7938),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Registrase",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "ó",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.diseosinttulo62),
            contentDescription = "Diseo sin ttulo (6) 2",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-46).dp,
                    y = (-20).dp)
                .requiredWidth(width = 443.dp)
                .requiredHeight(height = 840.dp)
                .rotate(degrees = 0.25f))
        Image(
            painter = painterResource(id = R.drawable.rectangle2),
            contentDescription = "Rectangle 2",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 79.dp,
                    y = 54.dp)
                .requiredWidth(width = 206.dp)
                .requiredHeight(height = 157.dp)
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Busqueda por Fecha y Hora",
            color = Color(0xffbe7938),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Historial de Citas",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.rectangle9),
            contentDescription = "Rectangle 9",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 337.0000114440918.dp)
                .requiredWidth(width = 326.dp)
                .requiredHeight(height = 324.dp)
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Buscar",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun HistorialCitaPreview() {
    HistorialCita(Modifier)
}