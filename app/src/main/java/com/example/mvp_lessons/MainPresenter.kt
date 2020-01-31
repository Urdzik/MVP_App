package com.example.mvp_lessons

import android.util.Log

class MainPresenter(private var mView: MainContact.View) : Presenter {
    private val TAG = "MainRepository"

    private var mRepository: Repository = MainRepository()
    private var message: String? = null
    
    override fun onButtonWasClicked() {
        message = mRepository.loadMessage()
        mView.showText(message)
        Log.d(TAG, "onButtonWasClicked()");
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy()");
    }
}