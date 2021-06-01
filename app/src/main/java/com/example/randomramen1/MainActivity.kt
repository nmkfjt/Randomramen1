package com.example.randomramen1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv: TextView = findViewById(R.id.textramen)
        var btn: Button = findViewById(R.id.startbutton)

        btn.setOnClickListener {

            var ramen = arrayOf("醤油らーめん","味噌らーめん","塩らーめん","つけ麺","家系らーめん","長岡系らーめん","三条系らーめん")

            var num = Random().nextInt(ramen.count())

            tv.text =ramen.get(num)
        }
    }
}