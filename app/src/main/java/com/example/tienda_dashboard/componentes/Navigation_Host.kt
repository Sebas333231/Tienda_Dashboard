package com.example.tienda_dashboard.componentes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.tienda_dashboard.pages.Page_Contenidos
import com.example.tienda_dashboard.pages.Page_Flores
import com.example.tienda_dashboard.pages.Page_Frutas_Verduras
import com.example.tienda_dashboard.pages.Page_Huevos
import com.example.tienda_dashboard.pages.Page_Informacion
import com.example.tienda_dashboard.pages.Page_Inicio
import com.example.tienda_dashboard.pages.Page_Lacteos
import com.example.tienda_dashboard.pages.Page_Principal
import com.example.tienda_dashboard.pages.Page_Ver_Mas

@Composable
fun Navigation_Host(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = MenuItem.Page01.ruta
    ){
        composable(MenuItem.Page01.ruta){
            Page_Principal()
        }
        composable(MenuItem.Page02.ruta){
            Page_Flores()
        }
        composable(MenuItem.Page03.ruta){
            Page_Frutas_Verduras()
        }
        composable(MenuItem.Page04.ruta){
            Page_Huevos()
        }
        composable(MenuItem.Page05.ruta){
            Page_Lacteos()
        }
        composable(MenuItem.Page06.ruta){
            Page_Ver_Mas()
        }
        composable(items_bar.Boton1.ruta){
            Page_Inicio()
        }
        composable(items_bar.Boton2.ruta){
            Page_Contenidos()
        }
        composable(items_bar.Boton3.ruta){
            Page_Informacion()
        }
    }
}

@Composable
fun Current_Route(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}
