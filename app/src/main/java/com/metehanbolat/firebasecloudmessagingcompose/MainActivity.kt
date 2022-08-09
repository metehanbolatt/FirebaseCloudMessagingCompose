package com.metehanbolat.firebasecloudmessagingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.firebasecloudmessagingcompose.ui.theme.FirebaseCloudMessagingComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseCloudMessagingComposeTheme {
            }
        }
    }
}
