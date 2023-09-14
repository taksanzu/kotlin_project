package com.example.greatingcards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greatingcards.ui.theme.GreatingCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreatingCardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Khang")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Surface(color = Color.Cyan) {
            Text(
                text = "Hi, my name is $name!",
                modifier = modifier.padding(24.dp),
            )

        }
        Surface(color = Color.Red) {
            Text(
                text = "Hi, my name is $name!",
                modifier = modifier.padding(24.dp),
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreatingCardsTheme {
        Greeting("Khang")
    }
}