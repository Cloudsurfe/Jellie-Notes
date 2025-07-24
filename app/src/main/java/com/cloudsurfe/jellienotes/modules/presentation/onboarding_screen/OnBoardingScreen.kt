package com.cloudsurfe.jellienotes.modules.presentation.onboarding_screen

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cloudsurfe.jellienotes.modules.presentation.onboarding_screen.components.OnBoardingBottom
import com.cloudsurfe.jellienotes.modules.presentation.setting_screen.SettingEvent
import kotlinx.coroutines.launch

@Composable
fun OnBoardingScreen(
    onClick: (SettingEvent) -> Unit
) {
    val pagerState = rememberPagerState(initialPage = 0) {
        3
    }
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        bottomBar = {
            OnBoardingBottom(
                pagerState = pagerState,
                onSkip = {
                    scope.launch {
                        if (pagerState.currentPage == 0) {
                            pagerState.animateScrollToPage(pagerState.pageCount)
                        } else {
                            pagerState.animateScrollToPage(pagerState.currentPage - 1)
                        }
                    }
                },
                onNext = {
                    scope.launch {
                        if (pagerState.currentPage == 2) {
                            onClick(SettingEvent.SetFirstLaunch)
                        } else {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    }
                }
            )
        },
        contentWindowInsets = WindowInsets(top = 0.dp)
    ) { paddingValues ->
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            userScrollEnabled = false
        ) {

        }
    }

}
