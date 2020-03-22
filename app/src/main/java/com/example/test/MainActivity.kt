package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var btn_afficher: Button? = null
    var btn_ajouter: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_afficher = findViewById<View>(R.id.affichage) as Button
        btn_afficher!!.setOnClickListener {
            Toast.makeText(applicationContext, "Affichage ok", Toast.LENGTH_LONG)
                .show()
            val activityChangeIntent =
                Intent(this@MainActivity, ListPersonActivity::class.java)
            this@MainActivity.startActivity(activityChangeIntent)
        }
        btn_ajouter = findViewById<View>(R.id.ajout) as Button
        btn_ajouter!!.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Ajout ok",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}