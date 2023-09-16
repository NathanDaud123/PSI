package com.example.lk01psi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Handler untuk menunda perpindahan ke halaman lain
        val splashTimeOut = 3000 // 3 detik
        val mainIntent = Intent(this, MainKalkulator::class.java)

        val splashTimer = object : Thread() {
            override fun run() {
                try {
                    sleep(splashTimeOut.toLong())
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    startActivity(mainIntent)
                    finish() // Tutup splash screen setelah berpindah ke halaman lain
                }
            }
        }
        splashTimer.start()
    }
}