package sv.edu.udb.proyectocatedraasb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sv.edu.udb.proyectocatedraasb.interfaces.InicioDeSesion
import sv.edu.udb.proyectocatedraasb.interfaces.SplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import sv.edu.udb.proyectocatedraapp.ui.theme.ProyectoCatedraAppTheme
import sv.edu.udb.proyectocatedraasb.interfaces.Menu
import sv.edu.udb.proyectocatedraasb.interfaces.RegistroDoctor
import sv.edu.udb.proyectocatedraasb.interfaces.RegistroMascota
import sv.edu.udb.proyectocatedraasb.interfaces.RegistroUsuario

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoCatedraAppTheme {
                // Create a NavController
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "menu"
                ) {
                    composable("login") {
                        InicioDeSesion(navController = navController)
                    }
                    composable("splash") {
                        SplashScreen(navController = navController)
                    }
                    composable("registroUsuario") {
                        RegistroUsuario(navController = navController)
                    }
                    composable("registroMascota") {
                        RegistroMascota(navController = navController)
                    }
                    composable("registroDoctor") {
                        RegistroDoctor(navController = navController)
                    }
                    composable("menu") {
                        Menu(navController = navController)
                    }
                }
            }
        }
    }
}
