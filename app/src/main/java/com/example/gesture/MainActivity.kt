package com.example.gesture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.MotionEventCompat as MotionEventCompat1

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    //variable untuk mendeteksi gesture yang diberi nilai awal yaitu null
    var gDetector: GestureDetectorCompat? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // membuat class turunan geesturedetectorcompat
        this.gDetector = GestureDetectorCompat(this, this)
        //mendeteksi ketukan ganda
        gDetector?.setOnDoubleTapListener(this)

    }

    //mencegah sentuhan/tap pada instansi
    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)

        //memastikan untuk memanggil implementasi superclass
        return super.onTouchEvent(event)
    }
        //implementasi untuk ketukan ondown
    override fun onDown(event: MotionEvent): Boolean {
        gesture_status.text = "onDown"
    return true
    }
        //implementasi untuk ketukan onfling
    override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {
        gesture_status.text = "onFling"
    return true
    }
        //implementasi untuk ketukan lama longpress
    override fun onLongPress(e: MotionEvent?) {
        gesture_status.text ="onLongpress"
    }
        //implementasi untuk ketukan scroll
    override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {
        gesture_status.text = "onScroll"
    return true
    }

    override fun onShowPress(e: MotionEvent?) {
        gesture_status.text = "onShowpress"
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        gesture_status.text = "onSingelTapTup"
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        gesture_status.text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        gesture_status.text = "onDoubleTapEvent"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        gesture_status.text = "onSingelTapConfrimed"
        return true
    }
}