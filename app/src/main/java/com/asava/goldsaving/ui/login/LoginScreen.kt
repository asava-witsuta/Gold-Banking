package com.asava.goldsaving.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asava.goldsaving.ui.foundation.AsavaTextField
import com.asava.goldsaving.ui.theme.Aleo
import com.asava.goldsaving.ui.theme.BtnColor
import com.asava.goldsaving.ui.theme.TextColor

@Composable
fun LoginScreen() {
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

            Button(
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BtnColor),
                onClick = { /*TODO*/ }
            ) {
                Text(
                    text = "Login",
                    color = Color(0xFF514838),
                    fontSize = 18.sp,
                    fontFamily = Aleo
                )
            }
        }
    }
}
