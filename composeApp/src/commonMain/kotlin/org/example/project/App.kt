package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
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



    }
//    DisplayInfo("Bernard", 23)
}

@Composable
fun AppContent(homeViewModel: HomeViewModel) {
    val products = homeViewModel.products.collectAsState()

    BoxWithConstraints {
        val scope = this
        val maxWidth = scope.maxWidth
        var cols = 2
        var modifier = Modifier.fillMaxWidth()
        if(maxWidth > 840.dp){
            cols = 3
            modifier =  Modifier.widthIn(max = 100.dp)
        }

        Column {  }
    }
}