package com.example.newelcomescreen

import android.R.attr.start
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newelcomescreen.ui.theme.NEWelcomescreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                horizontalAlignment =  Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Welcome to NE Welcome screen",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black

                )
            Column {
                Text(text = "Welcome to NE Welcome screen")

                Text(text = "Our Flashcard questions of history of Peter " +
                        "Ramoshoane Mokaba where we create innovative " +
                        "mobile application designed")

                Text(text = "to transform and elevate user experience " +
                        "by if a user needs to be able to make choices")

                Text(text = "then the app also needs to be able to deal" +
                        "with that on which whether is True or False and" +
                        "is it Correct and Incorrect")
            }
            Row {
                Button(
                    onClick = {
                        //Run when the button clicked/
                        val start = Intent(this@MainActivity, Flashcard::class.java)
                        startActivity(start)
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
                Text(text = "Start")
                 }




    }
}}

annotation class Flashcard}


