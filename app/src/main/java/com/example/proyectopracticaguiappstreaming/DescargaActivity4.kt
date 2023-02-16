package com.example.proyectopracticaguiappstreaming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DescargaActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descarga4)

        //Botones del índice de abajo
        findViewById<Button>(R.id.casa).setOnClickListener {
            var intento = Intent(this, InicioActivity2::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.lupa).setOnClickListener {
            var intento = Intent(this, LupaActivity3::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.descarga).setOnClickListener {
            var intento = Intent(this, DescargaActivity4::class.java)
            startActivity(intento)
        }
    }
}