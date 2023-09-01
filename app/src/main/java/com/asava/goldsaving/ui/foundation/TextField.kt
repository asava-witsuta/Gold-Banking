package com.asava.goldsaving.ui.foundation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asava.goldsaving.ui.theme.Aleo
import com.asava.goldsaving.ui.theme.TextColor

@Composable
fun AsavaTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String
) {
    val textFieldColor = Color(0xFFF7F2E3)

    Row(
        modifier = Modifier
            .padding(20.dp)
            .height(40.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(textFieldColor),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            singleLine = true,
            textStyle = TextStyle(
                color = TextColor,
                fontSize = 16.sp,
                fontFamily = Aleo
            ),
            modifier = Modifier.padding(horizontal = 18.dp),
            decorationBox = { innerTextField ->
                if (value.isEmpty()) {
                    Text(
                        text = placeholder,
                        color = TextColor,
                        fontSize = 16.sp,
                        fontFamily = Aleo
                    )
                }
                innerTextField()
            },
            cursorBrush = SolidColor(TextColor)
        )
    }
}
