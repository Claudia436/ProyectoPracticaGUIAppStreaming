package com.example.proyectopracticaguiappstreaming

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class InicioActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio2)

        //botón disney a serie la busqueda
        findViewById<Button>(R.id.botonD).setOnClickListener {
            var intento = Intent(this, DisneyActivity6::class.java)
            startActivity(intento)
        }
        //botón pixar a película wall-e
        findViewById<Button>(R.id.botonP).setOnClickListener {
            var intento = Intent(this, PixarActivity7::class.java)
            startActivity(intento)
        }
        //botón marvel a película wakanda
        findViewById<Button>(R.id.botonM).setOnClickListener {
            var intento = Intent(this, MarvelActivity8::class.java)
            startActivity(intento)
        }
        //botón marvel a serie la remesa mala
        findViewById<Button>(R.id.botonW).setOnClickListener {
            var intento = Intent(this, WarsActivity9::class.java)
            startActivity(intento)
        }
        //botón geo a documental cosmos
        findViewById<Button>(R.id.botonN).setOnClickListener {
            var intento = Intent(this, GeoActivity10::class.java)
            startActivity(intento)
        }
        //botón star a película el menu
        findViewById<Button>(R.id.botonS).setOnClickListener {
            var intento = Intent(this, StarActivity11::class.java)
            startActivity(intento)
        }

        //imagen botón a película wakanda
        findViewById<ImageButton>(R.id.cartelera1).setOnClickListener {
            var intento = Intent(this, MarvelActivity8::class.java)
            startActivity(intento)
        }
        //imagen botón a serie la remesa mala
        findViewById<ImageButton>(R.id.cartelera2).setOnClickListener {
            var intento = Intent(this, StarActivity11::class.java)
            startActivity(intento)
        }
        //imagen botón a serie la busqueda
        findViewById<ImageButton>(R.id.cartelera3).setOnClickListener {
            var intento = Intent(this, DisneyActivity6::class.java)
            startActivity(intento)
        }
        //imagen botón geo a documental cosmos
        findViewById<ImageButton>(R.id.cartelera4).setOnClickListener {
            var intento = Intent(this, GeoActivity10::class.java)
            startActivity(intento)
        }
        //imagen botón star a película el menu
        findViewById<ImageButton>(R.id.cartelera5).setOnClickListener {
            var intento = Intent(this, StarActivity11::class.java)
            startActivity(intento)
        }
        //imagen botón pixar a película wall-e
        findViewById<ImageButton>(R.id.cartelera6).setOnClickListener {
            var intento = Intent(this, PixarActivity7::class.java)
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