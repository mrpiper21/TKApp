package org.example.project

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun DisplayInfo(name: String, age: Int){
    MaterialTheme{
        Text("Hello $name your are $age of age")
    }
}