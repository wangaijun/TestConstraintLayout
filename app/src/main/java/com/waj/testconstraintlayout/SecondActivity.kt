package com.waj.testconstraintlayout

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button.setOnClickListener {
            button.text = "${button.text}A"
        }

        button2.setOnClickListener {
            button2.text = "${button2.text}B"
        }
    }
}
