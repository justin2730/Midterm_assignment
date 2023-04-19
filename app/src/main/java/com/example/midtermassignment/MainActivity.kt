package com.example.midtermassignment

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun page2(view: View){
        val intent = Intent(this, B::class.java )
        startActivity(intent)
    }

    fun page3(view: View){
        val intent = Intent(this, C::class.java )
        startActivity(intent)
    }
}