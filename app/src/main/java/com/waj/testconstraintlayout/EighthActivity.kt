package com.waj.testconstraintlayout

import android.app.Activity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_eighth.*

class EighthActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eighth)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event?.let {
            if (event.action == MotionEvent.ACTION_DOWN){
                if (group1.visibility == View.VISIBLE) {
                    group1.visibility = View.GONE
                }else{
                    group1.visibility = View.VISIBLE
                }
            }
        }
        return super.onTouchEvent(event)
    }
}
