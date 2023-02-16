package com.example.proyectopracticaguiappstreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UsersActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users1)

        findViewById<Button>(R.id.user1).setOnClickListener {
            var intento = Intent(this, InicioActivity2::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.user2).setOnClickListener {
            var intento = Intent(this, InicioActivity2::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.user3).setOnClickListener {
            var intento = Intent(this, InicioActivity2::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.user4).setOnClickListener {
            var intento = Intent(this, InicioActivity2::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.user5).setOnClickListener {
            var intento = Intent(this, InicioActivity2::class.java)
            startActivity(intento)
        }
    }
}