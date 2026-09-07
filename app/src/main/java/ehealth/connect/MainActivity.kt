package ehealth.connect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ehealth.connect.ui.screens.SplashScreen

import ehealth.connect.ui.theme.EHealthConnectAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            EHealthConnectAppTheme {
                SplashScreen()
            }
        }
    }
}