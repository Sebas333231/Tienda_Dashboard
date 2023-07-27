package com.example.tienda_dashboard.pages

import android.content.Context
import android.graphics.BitmapFactory
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tienda_dashboard.R
import com.example.tienda_dashboard.componentes.CreateChannelNotification
import com.example.tienda_dashboard.componentes.notificacionImagen
import com.example.tienda_dashboard.componentes.notificacionProgramada
import com.example.tienda_dashboard.componentes.notificationExtensa
import com.example.tienda_dashboard.componentes.notificationSencille

@Composable
fun Page_Informacion(){

    val idNotication: Int = 0
    val context: Context = LocalContext.current
    val idChannel: String = "Canal Tienda"
    val name: String = "Canal Tienda"
    val descriptionText: String = "Canal de Notificaciones Tienda CBA"

    val textShort: String = "Ejemplo de notificacion sencilla con prioridad por omision (default)"
    val textLong: String = "Saludos! Esta es una prueba de notificaciones. Bebe aparecer " +
            "un icono a la derecha y el texto puede tener una longitud de 200 caracteres "+
            "Gracias y hasta pronto"
    val iconoBig = BitmapFactory.decodeResource(
        context.resources,
        R.drawable.plus
    )
    val imagenBig = BitmapFactory.decodeResource(
        context.resources,
        R.drawable.tienda
    )



    //Funcion de creacion propia como corrutina
    LaunchedEffect(Unit){
        CreateChannelNotification(
            idChannel,
            context,
            name,
            descriptionText
        )
    }

    val modifier = Modifier
        .padding(18.dp)
        .fillMaxWidth()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(18.dp)
            .fillMaxSize()
    ) {
        Text(
            text = "Informacion de Notificaciones",
            style = androidx.compose.ui.text.TextStyle(fontSize = 50.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center),
            modifier = Modifier.padding(bottom = 100.dp)
        )
        Button(
            onClick = {
                notificationSencille(
                    context,
                    idChannel,
                    idNotication,
                    "Notificacion Sencilla",
                    textShort
                )
            },
            modifier = modifier
        ) {
            Text(
                text = "Notificacion Sencilla",
                style = androidx.compose.ui.text.TextStyle(color = Color(0xFFFFFFFF))
            )
        }
        Button(
            onClick = {
                notificationExtensa(
                    context,
                    idChannel,
                    idNotication + 1,
                    "Notificacion Extensa",
                    textLong,
                    iconoBig
                )
            },
            modifier = modifier
        ) {
            Text(
                text = "Notificacion Extensa",
                style = androidx.compose.ui.text.TextStyle(color = Color(0xFFFFFFFF))
            )
        }
        Button(
            onClick = {
                notificacionImagen(
                    context,
                    idChannel,
                    idNotication + 2,
                    "Notificacion de Imagen",
                    textLong,
                    iconoBig,
                    imagenBig
                )
            },
            modifier = modifier
        ) {
            Text(
                text = "Notificacion de Imagen",
                style = androidx.compose.ui.text.TextStyle(color = Color(0xFFFFFFFF))
            )
        }
        Button(
            onClick = {
                notificacionProgramada(
                    context
                )
            },
            modifier = modifier
        ) {
            Text(
                text = "Notificacion Programada",
                style = androidx.compose.ui.text.TextStyle(color = Color(0xFFFFFFFF))
            )
        }
    }


}