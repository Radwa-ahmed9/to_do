package com.example.to_dooo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for 3 seconds and then navigate to MainActivity
        CoroutineScope(Dispatchers.Main).launch {
            delay(4000) // 4 seconds delay
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }

    }
}