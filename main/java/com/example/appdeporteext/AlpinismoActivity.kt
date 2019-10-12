package com.example.appdeporteext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alpinismo.*

class AlpinismoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpinismo)

        btnARegresar.setOnClickListener {
            System.exit(0)
        }
    }
}
