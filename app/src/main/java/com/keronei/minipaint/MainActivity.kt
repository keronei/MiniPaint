package com.keronei.minipaint

import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myCanvasView = MyCanvasView(this)

        myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN

        myCanvasView.contentDescription = getString(R.string.canvasContextDescription)

        setContentView(myCanvasView)

    }
}