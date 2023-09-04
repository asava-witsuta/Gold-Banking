package com.asava.goldsaving.ui.foundation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asava.goldsaving.ui.theme.Aleo
import com.asava.goldsaving.ui.theme.Black2
import com.asava.goldsaving.ui.theme.BtnColor

@Composable
fun AsavaButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = BtnColor),
        onClick = onClick
    ) {
        Text(
            text = text,
            color = Black2,
            fontSize = 18.sp,
            fontFamily = Aleo
        )
    }
}
