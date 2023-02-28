package com.example.coursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class Vehicule3(val wheelCount: Int) {
    fun showWheels() {
        println("le vehicule à ${this.wheelCount} roues")
    }
    abstract fun honk()
}

interface Fuel {
    var fuelGauge: Double

    fun fillGasTank() {
        println("Remplassage du réservoir")
        fuelGauge = 100.0
    }

    fun displayGasGauge() {
        println("La jauge est à $fuelGauge")
    }
}

interface Trick {
    fun wheeling()
}

class Car3 : Vehicule3(4), Fuel {
    override var fuelGauge: Double = 0.0

    override fun honk() {
        println("TuTUUUU!!!!")
    }
}

class Moto3 : Vehicule3(2), Fuel, Trick {
    override var fuelGauge: Double = 0.0

    override fun wheeling() {
        println("Roue arriere")
    }

    override fun fillGasTank() {
        super.fillGasTank()
        honk()
    }

    override fun honk() {
        println("tinTin!!!")
    }
}

class Bicycle: Vehicule3(2), Trick {
    override fun wheeling() {
        println("Roue arriere")
    }

    override fun honk() {
        println("dring !!!")
    }

}

class Interface : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface)

        val car = Car3()
        car.displayGasGauge()
        car.fillGasTank()
        car.displayGasGauge()

        val moto = Moto3()
        moto.fillGasTank()
        moto.displayGasGauge()
        moto.wheeling()

        val bicycle = Bicycle()
        bicycle.wheeling()
    }
}