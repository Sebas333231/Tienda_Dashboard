package com.example.tienda_dashboard.componentes

import com.example.tienda_dashboard.R

sealed class MenuItem(
    val icon: Int,
    val title: String,
    val ruta: String
){
    object Page01: MenuItem(R.drawable.tiendaa, "Tienda CBA", "page01")
    object Page02: MenuItem(R.drawable.flor, "Flores", "page02")
    object Page03: MenuItem(R.drawable.frutas, "Frutas y Verduras", "page03")
    object Page04: MenuItem(R.drawable.ege, "Carnicos", "page04")
    object Page05: MenuItem(R.drawable.lac, "Lacteos", "page05")
    object Page06: MenuItem(R.drawable.plus, "Noticias", "page06")
}