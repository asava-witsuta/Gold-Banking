package com.asava.goldsaving.ui.landing

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.asava.goldsaving.ui.theme.Aleo
import com.asava.goldsaving.ui.theme.TextColor
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun LandingScreen() {
    Box(
        Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Landing Screen",
                color = TextColor,
                fontSize = 24.sp,
                fontFamily = Aleo,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}
