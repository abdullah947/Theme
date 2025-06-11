package com.theme.theme.ui.themes

import androidx.compose.ui.graphics.Color
import com.theme.theme.ui.theme.Black100
import com.theme.theme.ui.theme.Blue300
import com.theme.theme.ui.theme.Blue50
import com.theme.theme.ui.theme.Blue500
import com.theme.theme.ui.theme.Blue700
import com.theme.theme.ui.theme.Gray100
import com.theme.theme.ui.theme.Gray300
import com.theme.theme.ui.theme.Gray400
import com.theme.theme.ui.theme.Gray600
import com.theme.theme.ui.theme.Gray800
import com.theme.theme.ui.theme.Gray900
import com.theme.theme.ui.theme.White100

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
    mainBgColor = Blue50,
    componentsBgColor = White100,
    headingColor = Blue700,
    subHeadingColor = Gray800,
    termsPolicyColor = Gray600,
    buttonColor = Blue700,
    txtFieldBorderColor = Blue300,
    txtFieldLabelColor = Gray400
)

val DarkMode = MyColors(
    mainBgColor = Black100,
    componentsBgColor = Gray900,
    headingColor = Gray100,
    subHeadingColor = Gray100,
    termsPolicyColor = Gray300,
    buttonColor = Blue500,
    txtFieldBorderColor = Gray900,
    txtFieldLabelColor = Gray300
)



