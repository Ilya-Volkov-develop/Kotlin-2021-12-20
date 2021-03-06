package ru.iliavolkov.firstappkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var btn: MaterialButton
    private lateinit var text1: TextView
    private lateinit var text2: TextView
    private lateinit var text3: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataClass = DataClass("Илья", 18)
        var copy = dataClass.copy(age = 16)
        init()

        btn.setOnClickListener {
            Toast.makeText(this, "Нажали на кнопку = $btn",Toast.LENGTH_SHORT).show()
            text1.text = dataClass.name
            text2.text = "${dataClass.age}"
            text3.text = "${copy.name} ${copy.age}"
            for (i in 0..2){
                when(i){
                    0->Log.d("MyLog", "${text1.text}")
                    1->Log.d("MyLog", "${text2.text}")
                    2->Log.d("MyLog", "${text3.text}")
                }
            }
        }

    }

    private fun init(){
        btn = findViewById(R.id.btn)
        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        text3 = findViewById(R.id.text3)
    }
}
