package com.example.myspecialapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
    Column {
        Text(
            text = "Hello $name!",
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = "Having fun?"
        )
    }
}

@Preview(
    showBackground = true,
    device = "spec:width=720px,height=1080px,dpi=440"
)
@Composable
fun GreetingPreview() {
    MySpecialApplicationTheme {
        Greeting(
            "Android",
            modifier = Modifier
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
fun GreetingLearnersPreview() {
    MySpecialApplicationTheme {
        Greeting(
            "Learners",
            modifier = Modifier
        )
    }
}