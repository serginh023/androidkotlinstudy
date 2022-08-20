package com.example.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    val box_one_text: View = findViewById(R.id.box_one_text)
    val box_two_text: View = findViewById(R.id.box_two_text)
    val box_three_text: View = findViewById(R.id.box_three_text)
    val box_four_text: View = findViewById(R.id.box_four_text)
    val box_five_text: View = findViewById(R.id.box_five_text)
    val constraintLayout: View = findViewById(R.id.constraint_layout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text,
                box_three_text, box_four_text,
                box_five_text, constraintLayout)
        for(item in clickableViews){
            item.setOnClickListener {makeColored(it)}
        }
    }

    private fun makeColored(view: View){
        when (view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.btn_red -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.btn_yellow -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.btn_green -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}