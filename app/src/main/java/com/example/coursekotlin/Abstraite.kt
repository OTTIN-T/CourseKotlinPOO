package com.example.coursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
abstract class Vehicule2(val wheelCount: Int) {
    fun showWheels() {
        println("le vehicule à ${this.wheelCount} roues")
    }
    abstract fun honk()
}

class Car2 : Vehicule2(4) {
    override fun honk() {
        println("TuTUUUU!!!!")
    }
}

class Moto2 : Vehicule2(2) {
    override fun honk() {
        println("tinTin!!!")    }
}

class Abstraite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstraite)

        var vehicule : Vehicule2
        vehicule = Car2()
        vehicule.showWheels()
        vehicule.honk()
        vehicule = Moto2()
        vehicule.showWheels()
        vehicule.honk()
    }
}