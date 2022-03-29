package com.example.class03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var countTV: TextView
    private lateinit var countBtn: Button
    private val TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: called")
        countTV = findViewById(R.id.countTV)
        countBtn = findViewById(R.id.countBtn)
        if(savedInstanceState != null){ //this block is used to show saved value after orientation
            count = savedInstanceState.getInt("count")
            countTV.text = count.toString()
        }
        countBtn.setOnClickListener {
            count++
            countTV.text = count.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) { //this method is used only when orientation operation starts. Used to save values temporarily
        outState.putInt("count",count)
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: called")
    }

}