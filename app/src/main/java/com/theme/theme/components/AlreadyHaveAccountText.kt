package com.theme.theme.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import com.theme.theme.screens.scaledSize
import com.theme.theme.ui.theme.AppColors
import com.theme.theme.ui.theme.PoppinsFontFamily
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