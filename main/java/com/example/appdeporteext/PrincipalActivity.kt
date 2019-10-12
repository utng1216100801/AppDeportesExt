package com.example.appdeporteext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        ////Manejo del evento
        btnSalto.setOnClickListener {
            startActivity(Intent(this, SaltoActivity::class.java))
        }
        btnSalir.setOnClickListener {
            System.exit(0)
        }
        btnFree.setOnClickListener {
            startActivity(Intent(this, FreeActivity::class.java))
        }
        btnAlpinismo.setOnClickListener {
            startActivity(Intent(this, AlpinismoActivity::class.java))
        }
    }// fin onCreate

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_simple, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: String = ""
        //Switch
        when (item.itemId){
            R.id.itnSalto -> msg="Salto Base seleccionadp"
            R.id.itmFree -> msg="Free-Solo seleccionado"
            R.id.itmAlpinismo -> msg="Alpinismo seleccionado"
            R.id.itmSalir -> msg="Hasta pronto"
        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}
