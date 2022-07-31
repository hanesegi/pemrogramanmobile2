package com.aplikasi.latihanjetpackcompose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aplikasi.latihanjetpackcompose2.ui.theme.Latihanjetpackcompose2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Latihanjetpackcompose2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Belajarline()
                    Hasil()
                }
            }
        }
    }
}

@Composable
fun Belajarline() {
    Canvas(modifier = Modifier.fillMaxSize().background(Color.White)){
        val canvasWidth = size.width
        val canvasHeight = size.height


    }
}


@Preview(showBackground = true)
@Composable
fun Hasil() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val w = 500
        val h = 500

        drawRect(Color.Blue,
        size = Size(500f,500f),
        topLeft = Offset(x = center.x-w/2, y = center.y-h/2)
        )

        drawLine(
            Color.Green, Offset(500f, 1000f),
            Offset(500f, 500f), strokeWidth = 10f
        )

        drawOval(
            color = Color(0xFFD3212D),
            topLeft = Offset(x = 25.dp.toPx(), y = 25.dp.toPx()),
            size = Size(width = size.width - 50.dp.toPx(),
                height = size.height/2 - 50.dp.toPx()
        )
        )

    }
}