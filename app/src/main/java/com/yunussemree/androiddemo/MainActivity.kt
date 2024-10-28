package com.yunussemree.androiddemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var sum:Int = 0
        val text1:TextView = findViewById<TextView>(R.id.textView)
        text1.setText(sum.toString())

        val anytypes = arrayOf(1, 2, 3, 4, 5, "Hello", "World", 3.14, 2.71)


        val btn1 = findViewById<Button>(R.id.btn_1)
        btn1.setText("Hello World")
        btn1.setOnClickListener(View.OnClickListener {
            sum++
            text1.setText(sum.toString())
        })

    }
}