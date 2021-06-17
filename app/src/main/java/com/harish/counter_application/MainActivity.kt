package com.harish.counter_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button=findViewById<Button>(R.id.button)
        var textview=findViewById<TextView>(R.id.textView)
        var button2=findViewById<Button>(R.id.secondbtn)
        var count=0

        button.setOnClickListener {
            count+=1
            textview.text=count.toString()
        }

        button2.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}