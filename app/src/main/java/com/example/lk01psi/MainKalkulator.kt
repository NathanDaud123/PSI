package com.example.lk01psi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

private fun Int.isNotEmpty(): Boolean {
    return this.toString().isNotEmpty()
}

class MainKalkulator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kalkulator)

        // Inisialisasi elemen UI
        val result = findViewById<TextView>(R.id.resultBox)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val clear = findViewById<Button>(R.id.button5)
        val bye = findViewById<Button>(R.id.button6)

        // Tombol penjumlahan
        button1.setOnClickListener {
            val textAngka1 = findViewById<EditText>(R.id.editTextNumber).text.toString()
            val textAngka2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

            if (textAngka1.isNotEmpty() && textAngka2.isNotEmpty()) {
                // Hitung hasil penjumlahan
                val angka1 = textAngka1.toFloat()
                val angka2 = textAngka2.toFloat()
                val hasil = angka1 + angka2

                // Tampilkan hasil di TextView
                result.text = "${hasil.toFloat()}"
            } else {
                Toast.makeText(this, "Harap isi kedua angka", Toast.LENGTH_SHORT).show()
            }

        }

        //Tombol pengurangan
        button2.setOnClickListener {
            // Angka 1 dan Angka 2
            val textAngka1 = findViewById<EditText>(R.id.editTextNumber).text.toString()
            val textAngka2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

            if (textAngka1.isNotEmpty() && textAngka2.isNotEmpty()) {
                // Hitung hasil pengurangan
                val angka1 = textAngka1.toFloat()
                val angka2 = textAngka2.toFloat()
                val hasil = angka1 - angka2

                // Tampilkan hasil di TextView
                result.text = "${hasil.toFloat()}"
            } else {
                Toast.makeText(this, "Harap isi kedua angka", Toast.LENGTH_SHORT).show()
            }

        }

        //Tombol perkalian
        button3.setOnClickListener {
            val textAngka1 = findViewById<EditText>(R.id.editTextNumber).text.toString()
            val textAngka2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

            if (textAngka1.isNotEmpty() && textAngka2.isNotEmpty()) {
                // Hitung hasil perkalian
                val angka1 = textAngka1.toFloat()
                val angka2 = textAngka2.toFloat()
                val hasil = angka1 * angka2

                // Tampilkan hasil di TextView
                result.text = "${hasil.toFloat()}"
            } else {
                Toast.makeText(this, "Harap isi kedua angka", Toast.LENGTH_SHORT).show()
            }
        }

        //tombol pembagian
        button4.setOnClickListener {
            val textAngka1 = findViewById<EditText>(R.id.editTextNumber).text.toString()
            val textAngka2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

            if (textAngka1.isNotEmpty() && textAngka2.isNotEmpty()) {
                // Hitung hasil pembagian
                val angka1 = textAngka1.toFloat()
                val angka2 = textAngka2.toFloat()
                val hasil = angka1 / angka2

                // Tampilkan hasil di TextView
                result.text = "${hasil.toFloat()}"
            } else {
                Toast.makeText(this, "Harap isi kedua angka", Toast.LENGTH_SHORT).show()
            }
        }

        //tombol hapus hasil
        clear.setOnClickListener {
            result.text = null
        }

        //tombol keluar dari program
        bye.setOnClickListener {
            Toast.makeText(this,"Terima kasih sudah mencoba",Toast.LENGTH_SHORT).show()
            Handler().postDelayed({
                finish()
            }, 2000)
        }
    }
}


