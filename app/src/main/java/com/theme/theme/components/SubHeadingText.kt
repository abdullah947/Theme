package com.theme.theme.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.theme.theme.screens.scaledSize
import com.theme.theme.ui.theme.AppColors
import com.theme.theme.ui.theme.PoppinsFontFamily
import ir.kaaveh.sdpcompose.ssp

@Composable
fun SubHeadingText(modifier: Modifier = Modifier) {
    Text(
        text = "Please login or sign up to continue using\nour app",
        color = AppColors.subHeadingColor,
        modifier = modifier,
        fontSize = scaledSize(16).ssp,
        lineHeight = scaledSize(16).ssp,
        fontWeight = FontWeight.Normal,
        fontFamily = PoppinsFontFamily
    )
}
