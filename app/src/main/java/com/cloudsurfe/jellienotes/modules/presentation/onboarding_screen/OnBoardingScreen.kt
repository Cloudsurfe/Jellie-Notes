package com.cloudsurfe.jellienotes.modules.presentation.onboarding_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.cloudsurfe.jellienotes.modules.presentation.setting_screen.SettingEvent

@Composable
fun OnBoardingScreen(
    onClick: (SettingEvent) -> Unit
) {
    val pageState = PagerState(currentPage = 0) {
        3
    }
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        bottomBar = {

        }
    ) { paddingValues ->


    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HorizontalPager(
            state = pageState,
            modifier = Modifier,
            contentPadding =,
            pageSize =,
            beyondViewportPageCount = 0,
            pageSpacing = Dp(),
            verticalAlignment =,
            flingBehavior =,
            userScrollEnabled = false,
            reverseLayout = false,
            key = {},
            pageNestedScrollConnection =,
            snapPosition =,
            overscrollEffect = null,
            pageContent =
        )
    }
}
