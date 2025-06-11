package com.theme.theme.screens

import androidx.compose.runtime.Composable
import com.theme.theme.ui.theme.ThemeTheme
import com.theme.theme.utils.WindowInfo
import com.theme.theme.utils.rememberWindowInfo


@Composable
fun SignupScreen() {
    val windowInfo = rememberWindowInfo()

    if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
        SignupPortraitScreen()
    } else {
        SignupLandscapeScreen()
    }
}

@ThemedPreview
@Composable
fun SignupScreenPreview() {
    ThemeTheme {
        SignupScreen()
    }
}