package com.zubet.aplikasipengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Registrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)
    }
    fun login (view: View){
        val pindah = Intent (this, Login::class.java)
        startActivity(pindah)
    }
}