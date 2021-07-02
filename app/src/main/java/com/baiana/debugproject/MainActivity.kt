package com.baiana.debugproject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.baiana.debugproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var clicks = 0

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setLogListeners()
    }

    private fun setLogListeners(){
        binding.debugBTN.setOnClickListener { Log.d("click", "Opa! cliquei no debug")}
        binding.errorBTN.setOnClickListener {
            clicks++
            Log.e("click", "Opa! cliquei no erro")
        }

        binding.infoBTN.setOnClickListener { Log.i("click", "Opa! cliquei no info")}
        binding.warningBTN.setOnClickListener { Log.w("click", "Opa! cliquei no warning")}
        binding.verboseBTN.setOnClickListener { Log.v("click", "Opa! cliquei no verbose")}
    }
}