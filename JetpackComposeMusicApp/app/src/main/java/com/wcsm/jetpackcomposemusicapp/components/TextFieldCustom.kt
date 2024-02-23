package com.wcsm.jetpackcomposemusicapp.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.wcsm.jetpackcomposemusicapp.R
import com.wcsm.jetpackcomposemusicapp.ui.theme.Blue900

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldCustom(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    icon: Int = R.drawable.ic_username,
    iconContextDescription: String? = null
) {

    TextField(
        value,
        onValueChange,
        modifier,
        label = {
            Text(text = hint, color = Color.White)
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Blue900,
            cursorColor = Color.Blue
        ),
        maxLines = 1,
        textStyle = TextStyle(
            color = Color.White,
            fontSize = 18.sp
        ),
        keyboardOptions = keyboardOptions,
        leadingIcon = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = iconContextDescription,
                tint = Color.White
            )
        }
    )
}