package com.asava.goldsaving.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.asava.goldsaving.ui.destinations.LandingScreenDestination
import com.asava.goldsaving.ui.foundation.AsavaButton
import com.asava.goldsaving.ui.foundation.AsavaTextField
import com.asava.goldsaving.ui.theme.Aleo
import com.asava.goldsaving.ui.theme.TextColor
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@RootNavGraph(start = true)
@Destination
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator
) {
    Box(
        Modifier.fillMaxWidth()
    ) {
        var text by remember { mutableStateOf("") }

        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Gold Saving",
                color = TextColor,
                fontSize = 24.sp,
                fontFamily = Aleo,
                fontWeight = FontWeight.SemiBold
            )

            AsavaTextField(
                value = text,
                onValueChange = { text = it },
                placeholder = "User Name"
            )

            AsavaTextField(
                value = text,
                onValueChange = { text = it },
                placeholder = "Password"
            )

            AsavaButton(
                text = "Login",
                onClick = {
                    navigator.navigate(LandingScreenDestination)
                }
            )
        }
    }
}
