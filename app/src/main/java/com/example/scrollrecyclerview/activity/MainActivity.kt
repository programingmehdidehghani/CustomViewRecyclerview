package com.example.scrollrecyclerview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scrollrecyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridHorizontalAction.setOnClickListener {
            startActivity(Intent(this, GridHorizontalAutoScrollActivity::class.java))
        }
        listHorizontalAction.setOnClickListener {
            startActivity(Intent(this, ListHorizontalAutoScrollActivity::class.java))
        }
    }
}