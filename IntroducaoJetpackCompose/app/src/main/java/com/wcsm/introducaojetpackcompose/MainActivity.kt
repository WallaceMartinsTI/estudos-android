package com.wcsm.introducaojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.wcsm.introducaojetpackcompose.ui.theme.IntroducaoJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroducaoJetpackComposeTheme {

            }
        }
    }

    @Composable
    fun PrimeiraTela() {
        Column() {
            Text(
                text = "Hello World!"
            )
            Text(
                text = "Marcos Duarte"
            )
            Text(
                text = "Maria da Silva"
            )
        }

    }

    @Preview
    @Composable
    fun PrimeiraTelaPreview() {
        PrimeiraTela()
    }
}
