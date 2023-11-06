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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoCatedraAppTheme {
                // Create a NavController
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "login"
                ) {
                    composable("login") {
                        InicioDeSesion(navController = navController)
                    }
                    composable("splash") {
                        SplashScreen(navController = navController)
                    }
                }
            }
        }
    }
}
