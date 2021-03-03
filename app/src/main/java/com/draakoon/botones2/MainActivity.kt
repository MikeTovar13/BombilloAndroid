package com.draakoon.botones2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_1: Button = findViewById(R.id.button_1);
        var text_1: TextView = findViewById(R.id.text_1);
        var bombillo: ImageView = findViewById(R.id.bombillo)

        var on_off: Boolean = false;

        button_1.setOnClickListener {
            if (on_off == false) {
                text_1.setTextColor(resources.getColor(R.color.black))
                text_1.setBackgroundColor(resources.getColor(R.color.on))
                text_1.setText(resources.getText(R.string.light_on))

                button_1.setText(resources.getText(R.string.button_on))
                button_1.setBackgroundColor(resources.getColor(R.color.on))
                button_1.setTextColor(resources.getColor(R.color.black))

                bombillo.setImageDrawable(resources.getDrawable(R.drawable.on))
                on_off = true;

            } else {
                text_1.setTextColor(resources.getColor(R.color.white))
                text_1.setBackgroundColor(resources.getColor(R.color.off))
                text_1.setText(resources.getText(R.string.light_off))

                button_1.setText(resources.getText(R.string.button_off))
                button_1.setBackgroundColor(resources.getColor(R.color.off))
                button_1.setTextColor(resources.getColor(R.color.white))

                bombillo.setImageDrawable(resources.getDrawable(R.drawable.off))
                on_off = false;
            }
        }
    }
}