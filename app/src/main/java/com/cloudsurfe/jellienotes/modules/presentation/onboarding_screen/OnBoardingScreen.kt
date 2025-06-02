package com.cloudsurfe.jellienotes.modules.presentation.onboarding_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.cloudsurfe.jellienotes.modules.presentation.setting_screen.SettingEvent

@Composable
fun OnBoardingScreen(
    onClick : (SettingEvent) -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text("OnBoarding Screen")
        Button(
            onClick = {
                onClick(SettingEvent.SetFirstLaunch)
            }
        ) {
            Text("Home_screen")
        }
    }
}