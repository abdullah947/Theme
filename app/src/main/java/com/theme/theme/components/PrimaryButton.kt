package com.theme.theme.components

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.theme.theme.screens.scaledSize
import com.theme.theme.ui.theme.AppColors
import com.theme.theme.ui.theme.PoppinsFontFamily
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {},
        modifier = modifier
            .height(scaledSize(52).sdp),
        colors = ButtonDefaults.buttonColors(
            containerColor = AppColors.buttonColor
        )
    ) {
        Text(
            text = "Create account",
            textAlign = TextAlign.Center,
            fontSize = scaledSize(16).ssp,
            lineHeight = scaledSize(16).ssp,
            fontWeight = FontWeight.Bold,
            fontFamily = PoppinsFontFamily
        )
    }
}