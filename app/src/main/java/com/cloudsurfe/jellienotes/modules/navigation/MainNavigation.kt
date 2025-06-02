package com.cloudsurfe.jellienotes.modules.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.cloudsurfe.jellienotes.modules.presentation.home_screen.HomeScreen
import com.cloudsurfe.jellienotes.modules.presentation.onboarding_screen.OnBoardingScreen
import com.cloudsurfe.jellienotes.modules.presentation.plugin_screen.PluginScreen
import com.cloudsurfe.jellienotes.modules.presentation.setting_screen.SettingEvent
import com.cloudsurfe.jellienotes.modules.presentation.setting_screen.SettingScreen
import com.cloudsurfe.jellienotes.modules.presentation.setting_screen.SettingViewModel


@Composable
fun MainNavigation(
    startDestination: NavKey,
    settingViewModel: SettingViewModel,
    finishActivity: () -> Unit
) {
    val backstack = rememberNavBackStack(startDestination)

    NavDisplay(
        backStack = backstack,
        onBack = { backstack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<OnBoarding> {
                BackHandler {
                    finishActivity()
                }
                OnBoardingScreen(
                    onClick = {
                        when (it) {
                            SettingEvent.SetFirstLaunch -> settingViewModel.onEvent(it)
                            else -> Unit
                        }
                        backstack.add(Home)
                    }
                )
            }
            entry<Home> {
                BackHandler {
                    finishActivity()
                }
                HomeScreen(
                    onClick = {
                        backstack.add(Setting)
                    }
                )
            }
            entry<Setting> {
                SettingScreen(
                    onClick = {
                        backstack.add(Plugin)
                    }
                )
            }
            entry<Plugin> {
                PluginScreen()
            }
        }
    )
}