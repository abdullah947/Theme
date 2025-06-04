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
import androidx.compose.ui.platform.LocalConfiguration
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
import ir.kaaveh.sdpcompose.sdp
import kotlin.math.roundToInt

fun scaledSize(value: Int) = (value / 1.25).roundToInt()

@Composable
fun SignupScreen() {

    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    var txtEmail by remember { mutableStateOf("") }
    var txtPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = AppColors.mainBgColor),
        verticalArrangement = Arrangement.Top,
    ) {
        if (isPortrait) {
            Spacer(modifier = Modifier.height(scaledSize(80).sdp))
            HeadingText(modifier = Modifier.padding(horizontal = scaledSize(20).sdp))
            Spacer(modifier = Modifier.height(scaledSize(22).sdp))
            SubHeadingText(
                modifier = Modifier
                    .padding(horizontal = scaledSize(17).sdp)
            )

            Spacer(modifier = Modifier.height(scaledSize(28).sdp))
            EnterViaSocialText(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
            )
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
            OrLoginWithEmailText(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
            )
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

        } else {
            Spacer(modifier = Modifier.height(scaledSize(30).sdp))
            HeadingText(modifier = Modifier.padding(horizontal = scaledSize(23).sdp))

            Spacer(modifier = Modifier.height(scaledSize(20).sdp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = scaledSize(23).sdp)
            ) {
                SubHeadingText(
                    modifier = Modifier
                        .padding(top = scaledSize(1).sdp)
                )

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
                )
                {
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
                    modifier = Modifier
                        .width(scaledSize(340).sdp),
                    contentAlignment = Alignment.Center
                )
                {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .width(scaledSize(116).sdp)
                    ) {
                        CircularIconBox(R.drawable.ic_apple)
                        CircularIconBox(R.drawable.ic_google)

                    }

                }

                PrimaryButton(
                    modifier = Modifier
                        .width(scaledSize(335).sdp)
                )

            }
            Spacer(modifier = Modifier.height(scaledSize(23).sdp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = scaledSize(23).sdp)
            ) {
                Box(
                    modifier = Modifier
                        .width(scaledSize(340).sdp),
                    contentAlignment = Alignment.Center
                )
                {
                    OrLoginWithEmailText()

                }
                Box(
                    modifier = Modifier
                        .width(scaledSize(335).sdp),
                    contentAlignment = Alignment.Center
                ) {
                    AlreadyHaveAccountText()
                }
            }
            Spacer(modifier = Modifier.height(scaledSize(7).sdp))
            TermsAndPrivacyText(
                modifier = Modifier
                    .padding(start = scaledSize(505).sdp)
            )
        }
    }
}

