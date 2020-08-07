package com.example.canvas_kt

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    var drawView : DrawView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        makeCanvas()
    }

    fun makeCanvas(){
        drawView = DrawView(this)
        setContentView(drawView)
    }


    class DrawView(ct : Context) : View(ct)  {
        override fun onDraw(canvas: Canvas?) {
            canvas?.drawColor(Color.LTGRAY)
        }
    }
    

}