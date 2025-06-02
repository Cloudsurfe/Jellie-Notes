package com.cloudsurfe.jellienotes.modules.presentation

import androidx.compose.runtime.Composable
import com.cloudsurfe.jellienotes.modules.navigation.Home
import com.cloudsurfe.jellienotes.modules.navigation.MainNavigation
import com.cloudsurfe.jellienotes.modules.navigation.OnBoarding
import com.cloudsurfe.jellienotes.modules.presentation.setting_screen.SettingViewModel

@Composable
fun JellieNotesApp(
    firstLaunch: Boolean,
    settingSViewModel: SettingViewModel,
    finishActivity: () -> Unit
) {
    MainNavigation(
        startDestination = if (firstLaunch) OnBoarding else Home,
        settingViewModel = settingSViewModel,
        finishActivity = finishActivity
    )
}