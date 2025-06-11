package com.theme.theme.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
fun SignupLandscapeScreen() {
    var txtEmail by remember { mutableStateOf("") }
    var txtPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = AppColors.mainBgColor),
        verticalArrangement = Arrangement.Top,
    ) {
        Spacer(modifier = Modifier.height(scaledSize(30).sdp))
        HeadingText(modifier = Modifier.padding(horizontal = scaledSize(23).sdp))
        Spacer(modifier = Modifier.height(scaledSize(20).sdp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = scaledSize(23).sdp)
        ) {
            SubHeadingText(modifier = Modifier.padding(top = scaledSize(1).sdp))

            CustomTextField(
                value = txtEmail,
                onValueChange = { txtEmail = it },
                labelText = "Your Email",
                modifier = Modifier.width(scaledSize(335).sdp)
            )
        }

        Spacer(modifier = Modifier.height(scaledSize(12).sdp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = scaledSize(23).sdp)
        ) {
            Box(
                modifier = Modifier
                    .padding(start = scaledSize(13).sdp, top = scaledSize(13).sdp)
                    .width(scaledSize(340).sdp),
                contentAlignment = Alignment.Center
            ) {
                EnterViaSocialText()
            }

            CustomTextField(
                value = txtPassword,
                onValueChange = { txtPassword = it },
                labelText = "Password",
                modifier = Modifier.width(scaledSize(335).sdp)
            )
        }

        Spacer(modifier = Modifier.height(scaledSize(12).sdp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = scaledSize(23).sdp)
        ) {
            Box(
                modifier = Modifier.width(scaledSize(340).sdp),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.width(scaledSize(116).sdp)
                ) {
                    CircularIconBox(R.drawable.ic_apple)
                    CircularIconBox(R.drawable.ic_google)
                }
            }

            PrimaryButton(modifier = Modifier.width(scaledSize(335).sdp))
        }

        Spacer(modifier = Modifier.height(scaledSize(23).sdp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = scaledSize(23).sdp)
        ) {
            Box(
                modifier = Modifier.width(scaledSize(340).sdp),
                contentAlignment = Alignment.Center
            ) {
                OrLoginWithEmailText()
            }
            Box(
                modifier = Modifier.width(scaledSize(335).sdp),
                contentAlignment = Alignment.Center
            ) {
                AlreadyHaveAccountText()
            }
        }
        Spacer(modifier = Modifier.height(scaledSize(7).sdp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = scaledSize(23).sdp)
        ) {
            Box(
                modifier = Modifier.width(scaledSize(340).sdp),
                contentAlignment = Alignment.Center
            ) {

            }
            Box(
                modifier = Modifier.width(scaledSize(335).sdp),
                contentAlignment = Alignment.Center
            ) {
                TermsAndPrivacyText()
            }
        }
    }
}


@ThemedPreview1
@Composable
fun SignupLandscapeScreenPreview() {
    ThemeTheme {
        SignupLandscapeScreen()
    }
}


@Preview(
    name = "Light Mode - Landscape",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    widthDp = 800,
    heightDp = 400
)
@Preview(
    name = "Dark Mode - Landscape",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    widthDp = 800,
    heightDp = 400
)
annotation class ThemedPreview1