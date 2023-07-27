package com.example.tienda_dashboard.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tienda_dashboard.R

@Composable
fun Page_Contenidos(){
    Column {
        Epa()
    }
}

@Composable
fun Epa(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(18.dp)
            .fillMaxSize()
    ) {
        Text(
            text = "Tienda SENA",
            style = TextStyle(fontSize = 45.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Image(
            painter = painterResource(id = R.drawable.tiendaa),
            contentDescription = null,
            modifier = Modifier
                .width(280.dp)
                .height(280.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row{
            Text(
                text = "Telefono de contactos",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "3227330****",
                style = TextStyle(fontSize = 20.sp)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row{
            Text(
                text = "Correo ",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "tiendasena@misena.edu.co",
                style = TextStyle(fontSize = 20.sp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "¡Compra Ahora!",
            style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold)
        )
    }
}

