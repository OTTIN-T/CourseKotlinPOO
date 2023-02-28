package com.example.coursekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// constructor primaire
class User(val name: String, val age: Int, val height: Float) {
    // condition
    private val canPlayBasketball = age > 5 && height > 1.50f
    // bloc init qui vérifie ma condition
    init {
        val basketSting = when (canPlayBasketball) {
            true -> "Peut jouer."
            false -> "Ne peut pas jouer."
        }
        print("Info: ${name}, $age ans, $basketSting")
    }
    constructor(name: String) : this(name, 5, 1.20f)
}



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hugo = User("Hugo", 20, 1.91f)
        val tim = User("Tim", 25, 1.00f)
        val toto = User("toto")

        val btnHeritage = findViewById<Button>(R.id.heritage)
        btnHeritage.setOnClickListener {
            val intent = Intent(this, Heritage::class.java)
            startActivity(intent)
        }

        val btnEncapsulation = findViewById<Button>(R.id.encapsulation)
        btnEncapsulation.setOnClickListener {
            val intent = Intent(this, Encapsulation::class.java)
            startActivity(intent)
        }

        val btnAbstraite = findViewById<Button>(R.id.abstraite)
        btnAbstraite.setOnClickListener {
            val intent = Intent(this, Abstraite::class.java)
            startActivity(intent)
        }

        val btnInterface = findViewById<Button>(R.id.interfaces)
        btnInterface.setOnClickListener {
            val intent = Intent(this, Interface::class.java)
            startActivity(intent)
        }

        val btnCast = findViewById<Button>(R.id.cast)
        btnCast.setOnClickListener {
            val intent = Intent(this, Cast::class.java)
            startActivity(intent)
        }

        val btnData = findViewById<Button>(R.id.data)
        btnData.setOnClickListener {
            val intent = Intent(this, DataClass::class.java)
            startActivity(intent)
        }

        val btnInner = findViewById<Button>(R.id.inner)
        btnInner.setOnClickListener {
            val intent = Intent(this, NestedInner::class.java)
            startActivity(intent)
        }
    }
}