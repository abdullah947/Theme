package com.theme.theme.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.theme.theme.screens.ThemedPreview
import com.theme.theme.utils.scaledSize
import com.theme.theme.ui.theme.AppColors
import com.theme.theme.ui.theme.PoppinsFontFamily
import com.theme.theme.ui.theme.ThemeTheme
import ir.kaaveh.sdpcompose.ssp

@Composable
fun OrLoginWithEmailText(modifier: Modifier = Modifier) {
    Text(
        text = "or login with\nemail",
        color = AppColors.subHeadingColor,
        textAlign = TextAlign.Center,
        modifier = modifier,
        fontSize = scaledSize(16).ssp,
        lineHeight = scaledSize(16).ssp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = PoppinsFontFamily
    )
}

@ThemedPreview
@Composable
fun OrLoginWithEmailTextPreview() {
    ThemeTheme {
        OrLoginWithEmailText(
            modifier = Modifier
        )
    }
}