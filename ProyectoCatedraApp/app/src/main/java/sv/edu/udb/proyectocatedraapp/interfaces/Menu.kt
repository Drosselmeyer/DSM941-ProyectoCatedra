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
fun Menu(modifier: Modifier = Modifier) {
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
                .offset(x = 62.dp,
                    y = 56.dp)
                .requiredWidth(width = 229.dp)
                .requiredHeight(height = 159.dp)
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.rectangle3),
            contentDescription = "Rectangle 3",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 229.dp)
                .requiredWidth(width = 146.dp)
                .requiredHeight(height = 163.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.rectangle8),
            contentDescription = "Rectangle 8",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 188.dp,
                    y = 603.0000152587891.dp)
                .requiredWidth(width = 146.dp)
                .requiredHeight(height = 163.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.rectangle6),
            contentDescription = "Rectangle 6",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 187.5.dp,
                    y = 229.dp)
                .requiredWidth(width = 146.dp)
                .requiredHeight(height = 163.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .rotate(degrees = 0.49f))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 416.dp)
                .requiredWidth(width = 146.dp)
                .requiredHeight(height = 163.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .rotate(degrees = 0.49f)
                .background(color = Color(0xfff7bf6c)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 603.dp)
                .requiredWidth(width = 146.dp)
                .requiredHeight(height = 163.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .rotate(degrees = 0.49f)
                .background(color = Color(0xfff7bf6c)))
        Image(
            painter = painterResource(id = R.drawable.rectangle7),
            contentDescription = "Rectangle 7",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 189.dp,
                    y = 416.00000381469727.dp)
                .requiredWidth(width = 146.dp)
                .requiredHeight(height = 163.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.ellipse1),
            contentDescription = "Ellipse 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 49.dp,
                    y = 255.dp)
                .requiredSize(size = 85.dp)
                .clip(shape = CircleShape)
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.ellipse2),
            contentDescription = "Ellipse 2",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 219.dp,
                    y = 255.dp)
                .requiredSize(size = 85.dp)
                .clip(shape = CircleShape)
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.ellipse3),
            contentDescription = "Ellipse 3",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 49.dp,
                    y = 428.99998474121094.dp)
                .requiredSize(size = 85.dp)
                .clip(shape = CircleShape)
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.ellipse4),
            contentDescription = "Ellipse 4",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 219.dp,
                    y = 428.9999885559082.dp)
                .requiredSize(size = 85.dp)
                .clip(shape = CircleShape)
                .rotate(degrees = 0.49f))
        Text(
            text = "Pacientes ",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
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
        Text(
            text = "Doctores",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Citas",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Cuenta",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Text(
            text = "Configuración ",
            color = Color(0xff49200c),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .fillMaxSize()
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.ellipse5),
            contentDescription = "Ellipse 5",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 49.dp,
                    y = 612.0000152587891.dp)
                .requiredSize(size = 85.dp)
                .clip(shape = CircleShape)
                .rotate(degrees = 0.49f))
        Image(
            painter = painterResource(id = R.drawable.ellipse6),
            contentDescription = "Ellipse 6",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 219.dp,
                    y = 615.9999847412109.dp)
                .requiredSize(size = 85.dp)
                .clip(shape = CircleShape)
                .rotate(degrees = 0.49f))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun MenuPreview() {
    Menu(Modifier)
}