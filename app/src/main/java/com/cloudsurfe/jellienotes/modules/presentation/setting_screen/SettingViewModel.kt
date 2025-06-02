package com.cloudsurfe.jellienotes.modules.presentation.setting_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cloudsurfe.jellienotes.core.SettingsConstants
import com.cloudsurfe.jellienotes.data.setting.SettingsDataStore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SettingViewModel @Inject constructor(
    private val settingsDataStore: SettingsDataStore
) : ViewModel() {

    private val _state = MutableStateFlow(SettingState())
    val state = _state.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        SettingState()
    )

    var setKeepOnScreenCondition: Boolean = true

    init {
        viewModelScope.launch {
            val firstLaunch =
                async { settingsDataStore.getBoolean(SettingsConstants.FIRST_LAUNCH) ?: true }

            _state.update {
                it.copy(
                    firstLaunch = firstLaunch.await()
                )
            }
            setKeepOnScreenCondition = false
        }
    }

    fun onEvent(event: SettingEvent) {
        when (event) {
            SettingEvent.SetFirstLaunch -> {
                viewModelScope.launch(Dispatchers.IO){
                    settingsDataStore.putBoolean(SettingsConstants.FIRST_LAUNCH,false)
                    _state.update {
                        it.copy(firstLaunch = false)
                    }
                }
            }

            is SettingEvent.SetDarkMode -> {

            }

        }

    }

}