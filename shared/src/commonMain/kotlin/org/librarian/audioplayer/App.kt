package org.librarian.audioplayer

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.painterResource

import kotlinproject.shared.generated.resources.Res
import kotlinproject.shared.generated.resources.compose_multiplatform
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        var isDarkMode by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(if (isDarkMode == true) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxSize().padding(10.dp, 10.dp)){
                Column(){
                    Text("Menu")
                    Text("Library")
                    Text("Settings")
                }
                Spacer(Modifier.width(400.dp))
                Column(verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally){
                    Text("Audio Player")
                    Spacer(Modifier.size(250.dp, 500.dp))
                    Row(){
                        Button(onClick={}){Text("Previous")}
                        Spacer(Modifier.width(20.dp))
                        Button(onClick = { showContent = !showContent }) {
                            Text("Play")
                        }
                        Spacer(Modifier.width(20.dp))
                        Button(onClick={}){Text("Next")}
                    }
                    AnimatedVisibility(showContent) {
                        val greeting = remember { Greeting().greet() }
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(painterResource(Res.drawable.compose_multiplatform), null)
                            Text("Compose UI: $greeting")
                        }
                    }
                }
            }
        }
    }
}
