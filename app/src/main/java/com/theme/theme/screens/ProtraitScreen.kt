package com.theme.theme.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.theme.theme.R
import com.theme.theme.components.AlreadyHaveAccountText
import com.theme.theme.components.CircularIconBox
import com.theme.theme.components.CustomTextField
import com.theme.theme.components.EnterViaSocialText
import com.theme.theme.components.HeadingText
import com.theme.theme.components.OrLoginWithEmailText
import com.theme.theme.components.PrimaryButton
import com.theme.theme.components.SubHeadingText
import com.theme.theme.components.TermsAndPrivacyText
import com.theme.theme.ui.theme.AppColors
import com.theme.theme.ui.theme.ThemeTheme
import com.theme.theme.utils.scaledSize
import ir.kaaveh.sdpcompose.sdp


@Composable
fun SignupPortraitScreen() {
    var txtEmail by remember { mutableStateOf("") }
    var txtPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = AppColors.mainBgColor),
        verticalArrangement = Arrangement.Top,
    ) {
        Spacer(modifier = Modifier.height(scaledSize(80).sdp))
        HeadingText(modifier = Modifier.padding(horizontal = scaledSize(20).sdp))
        Spacer(modifier = Modifier.height(scaledSize(22).sdp))
        SubHeadingText(modifier = Modifier.padding(horizontal = scaledSize(17).sdp))
        Spacer(modifier = Modifier.height(scaledSize(28).sdp))
        EnterViaSocialText(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(scaledSize(28).sdp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(scaledSize(116).sdp)
        ) {
            CircularIconBox(R.drawable.ic_apple)
            CircularIconBox(R.drawable.ic_google)
        }

        Spacer(modifier = Modifier.height(scaledSize(23).sdp))
        OrLoginWithEmailText(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(scaledSize(78).sdp))

        CustomTextField(
            value = txtEmail,
            onValueChange = { txtEmail = it },
            labelText = "Your Email",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = scaledSize(20).sdp)
        )
        Spacer(modifier = Modifier.height(scaledSize(12).sdp))
        CustomTextField(
            value = txtPassword,
            onValueChange = { txtPassword = it },
            labelText = "Password",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = scaledSize(20).sdp)
        )
        Spacer(modifier = Modifier.height(scaledSize(12).sdp))
        PrimaryButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = scaledSize(20).sdp)
        )

        Spacer(modifier = Modifier.height(scaledSize(26).sdp))
        AlreadyHaveAccountText(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(scaledSize(63).sdp))
        TermsAndPrivacyText(modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}

@ThemedPreview
@Composable
fun SignupPortraitScreenPreview() {
    ThemeTheme {
        SignupPortraitScreen()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO, name = "Light Theme" )
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark Theme")
annotation class ThemedPreview