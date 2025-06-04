package com.theme.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import com.theme.theme.screens.scaledSize
import com.theme.theme.ui.theme.AppColors
import ir.kaaveh.sdpcompose.sdp

@Composable
fun CircularIconBox(iconRes: Int) {
    val isDarkMode = isSystemInDarkTheme()
    Box(
        modifier = Modifier
            .size(scaledSize(52).sdp)
            .clip(CircleShape)
            .background(AppColors.componentsBgColor),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(iconRes),
            contentDescription = null,
            modifier = Modifier.size(scaledSize(22).sdp) ,
            colorFilter = if (isDarkMode) ColorFilter.tint(AppColors.headingColor) else null

        )
    }
}