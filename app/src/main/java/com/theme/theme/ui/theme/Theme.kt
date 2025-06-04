package com.theme.theme.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.theme.theme.R
import com.theme.theme.ui.themes.DarkMode
import com.theme.theme.ui.themes.LightMode
import com.theme.theme.ui.themes.MyColors


val PoppinsFontFamily = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
)

private val LocalColors = staticCompositionLocalOf { LightMode }
var isDarkTheme : Boolean = false

@Composable
fun ThemeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    isDarkTheme = darkTheme
    val colors = if (darkTheme) {
        DarkMode
    } else {
        LightMode
    }

    CompositionLocalProvider(
        LocalColors provides colors,
    ) {
        MaterialTheme(
            content = content
        )
    }
}

val AppColors: MyColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current




