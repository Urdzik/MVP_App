package com.example.mvp_lessons

interface MainContact {
    interface View {
        fun showText(message: String?)
    }
}

interface Presenter {
    fun onButtonWasClicked()
    fun onDestroy()
}

interface Repository {
    fun loadMessage(): String
}