package com.cloudsurfe.jellienotes.modules.presentation.onboarding_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun OnBoardingBottom(
    modifier: Modifier = Modifier,
    pagerState: PagerState,
    onSkip: () -> Unit,
    onNext: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        OnBoardingIndicator(
            count = pagerState.pageCount,
            pagerState = pagerState,
        )
        Row(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 25.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = onSkip,
                modifier = Modifier
                    .weight(1f),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(Color(android.graphics.Color.parseColor("#007EE5")))
            ) {
                Text(
                    text = if (pagerState.currentPage == 0) "Skip" else "Back",
                    modifier = Modifier
                        .padding(vertical = 10.dp),
                )
            }
            Button(
                onClick = onNext,
                modifier = Modifier
                    .padding(start = 5.dp)
                    .weight(1f),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(Color(android.graphics.Color.parseColor("#007EE5")))
            ) {
                Text(
                    text = if (pagerState.currentPage == 2) "Start" else "Next",
                    modifier = Modifier
                        .padding(vertical = 10.dp),
                )
            }

        }
    }
}

