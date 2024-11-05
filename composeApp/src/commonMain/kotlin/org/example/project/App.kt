package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import tkapp.composeapp.generated.resources.Res
import tkapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
       Column(modifier = Modifier.absolutePadding(left = 10.dp, right = 10.dp)) {
           var name: String by remember { mutableStateOf("N/A") }
            Column (modifier = Modifier) {
                Text("LOGIN")
            }
           TextField(value = name, onValueChange = {name = it}, modifier = Modifier.fillMaxWidth().padding(top = 20.dp))
           Button(onClick = {name = ""}, modifier = Modifier.fillMaxWidth().padding(top = 10.dp)){
               Text("Submit")
           }
           Column(modifier = Modifier.absolutePadding(left = 20.dp)) {
               var mylocation = calculateTime("Accra")
               Text("Hello")
               Text(mylocation)
           }
       }


    }
//    DisplayInfo("Bernard", 23)
}