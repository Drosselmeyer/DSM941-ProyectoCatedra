package sv.edu.udb.proyectocatedraasb.interfaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.*
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import sv.edu.udb.proyectocatedraasb.R
@Composable
fun Menu(modifier: Modifier = Modifier, navController: NavHostController) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        /*.requiredWidth(width = 360.dp)
        .requiredHeight(height = 800.dp)
        .clip(shape = RoundedCornerShape(30.dp))
        .rotate(degrees = 0.25f)
        .background(color = Color.White)*/
    )  {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                /*.align(alignment = Alignment.CenterHorizontally)*/
                .offset(x = (0).dp,
                    y = (0).dp)
                .requiredWidth(width = 200.dp)
                .requiredHeight(height = 200.dp)
                .rotate(degrees = 0.25f)
                .size(100.dp,50.dp)
                .padding(all = 8.dp),
            contentScale = ContentScale.Inside
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .background(Color(0xFFF7BF6C))
                .clickable { navController.navigate("RegistroMascota") },
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pacientes),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                                .padding(all = 8.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Pacientes",
                    color = Color(0xFF49200C),
                )
            }
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.veterinario),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                        .padding(all = 8.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Veterinario",
                    color = Color(0xFF49200C),
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .background(Color(0xFFF7BF6C))
                .clickable { navController.navigate("RegistroCitas") },
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.citas),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                        .padding(all = 8.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Citas",
                    color = Color(0xFF49200C),
                )
            }
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.historial),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                        .padding(all = 8.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Historial de Citas",
                    color = Color(0xFF49200C),
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxSize()
                .fillMaxWidth()
                .height(140.dp)
                .background(Color(0xFFF7BF6C))
                .clickable { navController.navigate("Cuenta") },
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cuenta),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                        .padding(all = 8.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Cuenta",
                    color = Color(0xFF49200C),
                )
            }
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.configuracion),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                        .padding(all = 8.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Configuración",
                    color = Color(0xFF49200C),
                )
            }
        }
     }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun MenuPreview() {
    val navController = rememberNavController()
    Menu(Modifier,navController)
}