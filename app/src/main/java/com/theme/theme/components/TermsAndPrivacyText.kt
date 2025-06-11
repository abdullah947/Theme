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
fun TermsAndPrivacyText(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        Text(
            text = "I accept App's ",
            color = AppColors.termsPolicyColor,
            fontSize = scaledSize(11).ssp,
            lineHeight = scaledSize(11).ssp,
            fontWeight = FontWeight.ExtraLight,
            fontFamily = PoppinsFontFamily
        )
        Text(
            text = "Terms of use ",
            color = AppColors.termsPolicyColor,
            fontSize = scaledSize(11).ssp,
            lineHeight = scaledSize(11).ssp,
            fontWeight = FontWeight.ExtraLight,
            fontFamily = PoppinsFontFamily,
            textDecoration = TextDecoration.Underline
        )
        Text(
            text = "and ",
            color = AppColors.termsPolicyColor,
            fontSize = scaledSize(11).ssp,
            lineHeight = scaledSize(11).ssp,
            fontWeight = FontWeight.ExtraLight,
            fontFamily = PoppinsFontFamily
        )
        Text(
            text = "Privacy Policy.",
            color = AppColors.termsPolicyColor,
            fontSize = scaledSize(11).ssp,
            lineHeight = scaledSize(11).ssp,
            fontWeight = FontWeight.ExtraLight,
            fontFamily = PoppinsFontFamily,
            textDecoration = TextDecoration.Underline
        )
    }
}

@ThemedPreview
@Composable
fun TermsAndPrivacyTextPreview() {
    ThemeTheme {
        TermsAndPrivacyText(
            modifier = Modifier
        )
    }
}