package com.zubet.aplikasipengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class tampilanAwal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_awal)

        Handler().postDelayed({
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}