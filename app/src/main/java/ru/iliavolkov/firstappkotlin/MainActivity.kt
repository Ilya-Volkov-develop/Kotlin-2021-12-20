package ru.iliavolkov.firstappkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    val btn: MaterialButton = findViewById(R.id.btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener { Toast.makeText(this, "Нажали на $btn",Toast.LENGTH_SHORT).show() }
    }
}