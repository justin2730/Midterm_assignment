package com.example.midtermassignment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class C : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

    }

    fun page1(view: View){
        val intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
    }
}