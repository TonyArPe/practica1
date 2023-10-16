package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "Pantalla"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sobreescribimos los metodos principales de onStart onResume
        //onPause onRestart onStop onDestroy

    }
    override fun onStart(){
        super.onStart()
        Log.d(TAG, "Se llama despues de onCreate()." +
                " Muestro la pantalla. El usuario aún no puede" +
                " interaccionar")

    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "El usuario ya puede interaccionar con la pantalla")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Pierdo el foco de la pantalla. Boton home")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Vuelvo a estar visible para santi.")
    }


}