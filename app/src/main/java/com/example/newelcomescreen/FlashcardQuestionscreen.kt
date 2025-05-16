package com.example.newelcomescreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newelcomescreen.MainActivity
import com.example.newelcomescreen.ui.theme.NEWelcomescreenTheme

class FlashcardQuestionscreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var firstInt by remember{
                mutableStateOf("0")
            }
            var secondInt by remember{
                mutableStateOf("i")
            }

            Row {
                Button(
                    onClick = {
                        //Run when the button clicked/
                        val nextBytes = Intent(this@MainActivity,Flashcard::class.java)
                        startActivity(nextBytes)
                    },
                    modifier = TODO(),
                    enabled = TODO(),
                    shape = TODO(),
                    colors = TODO(),
                    elevation = TODO(),
                    border = TODO(),
                    contentPadding = TODO(),
                    interactionSource = TODO(),
                    content = TODO()
                )
                Text(text = "Next")
            }




        }
    }}

annotation class Flashcard}



fun Add(firstInt: Int, second: Int){

    val secondInt = null
    val value = secondInt + firstInt

}

