package com.jitendraalekar.traviscisample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Hello world",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Hello world!",Toast.LENGTH_SHORT).show()
    }
}
