package com.example.coursekotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class Vehicule(val wheelCount: Int) {
    fun showWheels() {
        println("le vehicule à ${this.wheelCount} roues")
    }
    open fun honk() {
        println("Pas de Klaxon")
    }
}

class Car : Vehicule(4) {
    override fun honk() {
        println("TuTUUUU!!!!")
    }
}

class Moto : Vehicule(2) {
    override fun honk() {
        println("tinTin!!!")    }
}

class Heritage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitvity_heritage)
        var vehicule : Vehicule
        vehicule = Car()
        vehicule.showWheels()
        vehicule.honk()
        vehicule = Moto()
        vehicule.showWheels()
        vehicule.honk()
    }
}