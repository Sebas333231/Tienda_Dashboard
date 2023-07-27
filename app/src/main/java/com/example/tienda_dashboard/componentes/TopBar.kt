package com.example.tienda_dashboard.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.tienda_dashboard.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState,
    navController: NavHostController,
    menuItem: List<MenuItem>
){
    var showMenu by remember {
        mutableStateOf(false)
    }
    var currentRoute = Current_Route(navController = navController)
    var myTitle = "Tienda Sena CBA"
    menuItem.forEach{item->
        if (currentRoute == item.ruta) myTitle = item.title
    }
    TopAppBar(
        backgroundColor = Color(0xFF4CAF50),
        title = {Text(
            text = myTitle,
            color = Color(0xFFFFFFFF),
            style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold)
        )},
        navigationIcon = {
            IconButton(
                onClick = {
                    scope.launch{
                        scaffoldState.drawerState.open()
                    }
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Icono de menu",
                    tint = Color(0xFFFFFFFF)
                )
            }
        },
        actions = {
            Image(
                painter = painterResource(id = R.drawable.logooo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(36.dp)
            )
            /*IconButton(
                onClick = {}
            ){
                Icon(
                    imageVector = Icons.Filled.Refresh,
                    contentDescription = "Refrescar",
                    tint = Color(0xFFFFFFFF)
                )
            }
            IconButton(
                onClick = {}
            ){
                Icon(
                    imageVector = Icons.Filled.Settings,
                    contentDescription = "Settings"
                )
            }
            IconButton(
                onClick = {showMenu = !showMenu}
            ){
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Mas Opciones"
                )
            }
            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = {showMenu = false},
                modifier = Modifier.width(150.dp)
            ) {
                DropdownMenuItem(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Idioma"
                    )
                    Spacer(modifier = Modifier.width(18.dp))
                    Text(text = "Idioma")
                }
                DropdownMenuItem(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "Compartir"
                    )
                    Spacer(modifier = Modifier.width(18.dp))
                    Text(text = "Compartir")
                }
            }*/
        }
    )
}
