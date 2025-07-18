package com.cloudsurfe.jellienotes.modules

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.cloudsurfe.jellienotes.core.SettingsConstants
import com.cloudsurfe.jellienotes.data.setting.SettingsDataStore
import com.cloudsurfe.jellienotes.modules.navigation.Home
import com.cloudsurfe.jellienotes.modules.navigation.OnBoarding
import com.cloudsurfe.jellienotes.modules.presentation.JellieNotesApp
import com.cloudsurfe.jellienotes.modules.presentation.setting_screen.SettingViewModel
import com.cloudsurfe.jellienotes.ui.theme.JellyNotesTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val settingsViewModel: SettingViewModel by viewModels()

    @Inject
    lateinit var settingsDataStore: SettingsDataStore
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.Companion.light(Color.TRANSPARENT, Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.Companion.light(
                Color.TRANSPARENT,
                Color.TRANSPARENT
            )
        )
        super.onCreate(savedInstanceState)
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition { settingsViewModel.setKeepOnScreenCondition }
        setContent {
            val firstLaunch =
                runBlocking { settingsDataStore.getBoolean(SettingsConstants.FIRST_LAUNCH) ?: true }
            val settingState = settingsViewModel.state.collectAsStateWithLifecycle()
            JellyNotesTheme(
                darkMode = settingState.value.darkMode,
            ) {
                JellieNotesApp(
                    startDestination = if (firstLaunch) OnBoarding else Home,
                    settingSViewModel = settingsViewModel,
                    finishActivity = {
                        finish()
                    }
                )
            }
        }
    }

}