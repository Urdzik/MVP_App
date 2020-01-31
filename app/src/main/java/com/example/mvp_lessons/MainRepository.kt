package com.example.mvp_lessons

import android.util.Log

class MainRepository : Repository {
    private val TAG = "MainRepository"


    override fun loadMessage(): String {
        Log.d(TAG, "loadMessage()")

        return "Сосисочная у лёхи"
    }
}