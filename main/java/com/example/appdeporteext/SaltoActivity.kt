package com.example.appdeporteext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_salto.*

class SaltoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salto)

        btnrRegresar.setOnClickListener {
            System.exit(0)
        }
    }
}
