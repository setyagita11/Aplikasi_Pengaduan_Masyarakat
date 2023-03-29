package com.zubet.aplikasipengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
    fun register (view: View){
        val pindah = Intent (this, Registrasi::class.java)
        startActivity(pindah)
    }

    fun setting (view: View){
        val pindah = Intent (this, Setting ::class.java)
        startActivity(pindah)
    }
     }
