package com.alaizhashim.questionsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_true.setOnClickListener{
        var toast=Toast.makeText(this,R.string.correct_answer,Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP,0,190)
            toast.show()
        }
        btn_false.setOnClickListener{
            var toast=Toast.makeText(this,R.string.incorrect_answer,Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP,0,190)
            toast.show()
        }
    }
}