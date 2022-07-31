package com.aplikasi.latihanjetpackcompose2.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class latihanmobile2 {
}

@Composable
fun garis(){
    val gariscolor = listOf(Color.Yellow, Color.Red, Color.Magenta)
    Canvas(modifier = Modifier
        .padding(all = 16.dp)
        .size(100.dp)){
        val canvasSize = size
        val canvasHeight = size.height
        val canvasWidth = size.width
    }

}