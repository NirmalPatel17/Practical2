package com.example.practical2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun showToast(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }

    private fun showSnackBar(msg:String) {
        Snackbar.make(findViewById(android.R.id.content),msg,Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showToast("onStart called")
        showSnackBar("onStart called")
    }

    override fun onResume() {
        super.onResume()
        showToast("onResume called")
        showSnackBar("onResume called")
    }

}