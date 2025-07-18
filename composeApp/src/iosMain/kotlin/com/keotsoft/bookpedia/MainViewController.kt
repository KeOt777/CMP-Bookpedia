package com.keotsoft.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.keotsoft.bookpedia.app.App
import com.keotsoft.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }