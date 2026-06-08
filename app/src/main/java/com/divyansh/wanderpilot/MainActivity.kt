package com.divyansh.wanderpilot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.divyansh.wanderpilot.ui.splash.SplashScreen
import com.divyansh.wanderpilot.ui.theme.WanderPilotTheme
import com.divyansh.wanderpilot.ui.onboarding.OnboardingScreen
import com.divyansh.wanderpilot.ui.login.LoginScreen
import com.divyansh.wanderpilot.ui.home.HomeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WanderPilotTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "WanderPilot",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "AI Travel Planner",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Plan Smarter. Travel Better."
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { }
        ) {
            Text("Get Started")
        }
    }
}