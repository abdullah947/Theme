package com.theme.theme.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import com.theme.theme.screens.ThemedPreview
import com.theme.theme.utils.scaledSize
import com.theme.theme.ui.theme.AppColors
import com.theme.theme.ui.theme.PoppinsFontFamily
import com.theme.theme.ui.theme.ThemeTheme
import ir.kaaveh.sdpcompose.ssp

@Composable
fun AlreadyHaveAccountText(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        Text(
            text = "Already have an account? ",
            color = AppColors.subHeadingColor,
            fontSize = scaledSize(14).ssp,
            lineHeight = scaledSize(14).ssp,
            fontWeight = FontWeight.Thin,
            fontFamily = PoppinsFontFamily
        )
        Text(
            text = "Login",
            color = AppColors.buttonColor,
            fontSize = scaledSize(14).ssp,
            lineHeight = scaledSize(14).ssp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = PoppinsFontFamily,
            textDecoration = TextDecoration.Underline
        )
    }
}

@ThemedPreview
@Composable
fun AlreadyHaveAccountTextPreview() {
    ThemeTheme {
        AlreadyHaveAccountText(
            modifier = Modifier
        )
    }
}