package com.cloudsurfe.jellienotes.modules.presentation.setting_screen

sealed class SettingEvent{
    data object SetFirstLaunch : SettingEvent()
    data class SetDarkMode(val darkMode : Boolean) : SettingEvent()
}





