package com.theme.theme.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.theme.theme.screens.ThemedPreview
import com.theme.theme.utils.scaledSize
import com.theme.theme.ui.theme.AppColors
import com.theme.theme.ui.theme.PoppinsFontFamily
import com.theme.theme.ui.theme.ThemeTheme
import ir.kaaveh.sdpcompose.ssp

@Composable
fun HeadingText(
    modifier: Modifier = Modifier
) {
    Text(
        text = "Sign Up",
        color = AppColors.headingColor,
        modifier = modifier,
        fontSize = scaledSize(32).ssp,
        lineHeight = scaledSize(32).ssp,
        fontWeight = FontWeight.Bold,
        fontFamily = PoppinsFontFamily
    )
}

@ThemedPreview
@Composable
fun HeadingTextPreview() {
    ThemeTheme {
        HeadingText(
            modifier = Modifier
        )
    }
}