package com.ly.mike

import tornadofx.*

class MyApp : App(MyView::class)

class MyView : View() {
    override val root = vbox {
        button("some")
    }
}

fun main(args: Array<String>) {
    launch<MyApp>(args)
}