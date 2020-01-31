package com.example.mvp_lessons

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), MainContact.View {
    private val TAG = "MainRepository"

    private lateinit var presenter: Presenter
    private lateinit var button: Button
    private lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener {
            presenter.onButtonWasClicked()
        }
        Log.d(TAG, "onCreate()")
    }

    override fun showText(message: String?) {
        textView.text = message
        Log.d(TAG, "showMessage()")
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
        Log.d(TAG, "onDestroy()")
    }
}
