package com.example.business_card_pathway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card_pathway.ui.theme.Business_card_pathwayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_card_pathwayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(modifier = Modifier.background(color = Color(0xFFFE5DFF))) {
        Column(modifier = Modifier.weight(2f).fillMaxWidth() ,
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.Center) {
            val image = painterResource(id = R.drawable.resume_maker_logo)
            Image(painter = image, contentDescription = null , modifier = Modifier.height(150.dp).width(150.dp))
            Text(text = stringResource(R.string.company_name) , fontWeight = FontWeight.Bold , fontSize = 24.sp)
            Text(text = stringResource(R.string.company_motto))
        }
        Column(modifier = Modifier.weight(1f)) {
          Row {
              val image = painterResource(id = R.drawable.phone)
              Image(painter = image, contentDescription = null , modifier = Modifier.padding(start = 16.dp , end = 16.dp , bottom = 16.dp))
              Text(text = stringResource(R.string.contact_phone))
          }
          Row {
              val image = painterResource(id = R.drawable.mail)
              Image(painter = image, contentDescription = null , modifier = Modifier.padding(start = 16.dp , end = 16.dp , bottom = 16.dp))
              Text(text = stringResource(R.string.contact_mail))
          }
            Row {
                val image = painterResource(id = R.drawable.linkedin)
                Image(painter = image, contentDescription = null , modifier = Modifier.padding(start = 16.dp , end = 16.dp , bottom = 16.dp))
                Text(text = stringResource(R.string.contact_linkedin) , textAlign = TextAlign.Justify)
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    Business_card_pathwayTheme {
        BusinessCard()
    }
}