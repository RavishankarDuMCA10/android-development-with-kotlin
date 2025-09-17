package com.example.myspecialapplication

import android.health.connect.datatypes.Device
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myspecialapplication.ui.theme.MySpecialApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MySpecialApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.height((400.dp))
    ) {
        Text(
            text = "Hello $name!",
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = "Having fun?",
            fontSize = 20.sp
        )
    }
}

@Preview(
    showBackground = true,
    device = Devices.NEXUS_5,
    name = "Nexus 5"
)
@Composable
fun MyComposableNexusPreview() {
    MySpecialApplicationTheme {
        Greeting(
            "Android",
            modifier = Modifier
        )
    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_4_XL,
    name = "PIXEL 4 XL"
)
@Composable
fun MyComposablePixelPreview() {
    MySpecialApplicationTheme {
        Greeting(
            "Learners",
            modifier = Modifier
        )
    }
}