package com.brayantellez.io.ja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var x: Int? = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("LOGV", "Este es un mensaje de registro detallado.");
        Log.d("LOGV", "Este es un mensaje de deputacion.");
        Log.w("LOGV", "Este es un mensaje de advertencia.");
        Log.i("LOGV", "Este es un mensaje de informacion.");
        Log.e("LOGV", "Este es un mensaje de error.");
        probando();
        x = 32;
    }
    private fun probando() {
        x = 10;
    }
}