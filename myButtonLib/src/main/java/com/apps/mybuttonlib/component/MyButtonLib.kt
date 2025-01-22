package com.apps.mybuttonlib.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButtonLib(
    text: String,
    color: ButtonColors =
        ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.Black
        )
){
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        colors = color,
        onClick = { /*TODO*/ }
    ) {
        Text(text = text)
    }
}

@Composable
@Preview
fun Preview() {
    MaterialTheme {
        MyButtonLib(
            text = "MI BOTON"
        )
    }
}