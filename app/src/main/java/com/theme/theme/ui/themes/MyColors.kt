package com.theme.theme.ui.themes


import androidx.compose.ui.graphics.Color

data class MyColors(
    val mainBgColor: Color,
    val componentsBgColor: Color,
    val headingColor: Color,
    val subHeadingColor: Color,
    val termsPolicyColor: Color,
    val buttonColor: Color,
    val txtFieldBorderColor: Color,
    val txtFieldLabelColor: Color,
)

val LightMode = MyColors(
    mainBgColor = Color(0xFFE2ECFF),
    componentsBgColor = Color(0xFFFFFFFF),
    headingColor = Color(0xFF1868FE),
    subHeadingColor = Color(0xFF494545),
    termsPolicyColor = Color(0xFF777777),
    buttonColor = Color(0xFF1868FE),
    txtFieldBorderColor = Color(0xFF6DA0FF),
    txtFieldLabelColor = Color(0xFFAAAAAA)
)

val DarkMode = MyColors(
    mainBgColor = Color(0xFF000000),
    componentsBgColor = Color(0xFF292B2F),
    headingColor = Color(0xFFDAD9DC),
    subHeadingColor = Color(0xFFDAD9DC),
    termsPolicyColor = Color(0xFFBBBBBB),
    buttonColor = Color(0xFF3D89F6),
    txtFieldBorderColor = Color(0xFF292B2F),
    txtFieldLabelColor = Color(0xFFBBBBBB)
)



