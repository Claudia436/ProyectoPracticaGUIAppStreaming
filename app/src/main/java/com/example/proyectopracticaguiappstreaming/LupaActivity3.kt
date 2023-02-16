package com.example.proyectopracticaguiappstreaming

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LupaActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa3)

        //Botones de la seccion de lupa que van a un activity blanco
        findViewById<Button>(R.id.originales).setOnClickListener {
            var intento = Intent(this, BusquedaActivity5::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.peliculas).setOnClickListener {
            var intento = Intent(this, BusquedaActivity5::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.series).setOnClickListener {
            var intento = Intent(this, BusquedaActivity5::class.java)
            startActivity(intento)
        }

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