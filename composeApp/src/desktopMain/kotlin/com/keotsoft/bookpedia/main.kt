package com.keotsoft.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.keotsoft.bookpedia.app.App
import com.keotsoft.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}