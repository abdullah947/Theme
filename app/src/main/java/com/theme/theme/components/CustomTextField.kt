package com.theme.theme.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.theme.theme.screens.scaledSize
import com.theme.theme.ui.theme.AppColors
import com.theme.theme.ui.theme.PoppinsFontFamily
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = labelText,
                color = AppColors.txtFieldLabelColor,
                fontSize = scaledSize(16).ssp,
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFontFamily
            )
        },
        modifier = modifier.height(scaledSize(52).sdp),
        shape = RoundedCornerShape(scaledSize(10).sdp),
        textStyle = LocalTextStyle.current.copy(
            fontSize = scaledSize(16).ssp,
            fontWeight = FontWeight.Normal,
            fontFamily = PoppinsFontFamily
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = AppColors.componentsBgColor,
            unfocusedContainerColor = AppColors.componentsBgColor,
            focusedBorderColor = AppColors.txtFieldBorderColor,
            unfocusedBorderColor = AppColors.txtFieldBorderColor,
        )
    )
}