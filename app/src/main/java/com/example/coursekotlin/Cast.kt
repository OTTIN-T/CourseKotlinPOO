package com.example.coursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class Vehicule4(val wheelCount: Int) {
    fun showWheels() {
        println("le vehicule à ${this.wheelCount} roues")
    }
    abstract fun honk()
}

class Car4 : Vehicule4(4), Fuel {
    override var fuelGauge: Double = 0.0

    override fun honk() {
        println("TuTUUUU!!!!")
    }
}

class Moto4 : Vehicule4(2), Fuel, Trick {
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

class Bicycle2: Vehicule4(2), Trick {
    override fun wheeling() {
        println("Roue arriere")
    }

    override fun honk() {
        println("dring !!!")
    }

}

class Cast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cast)

        var v: Vehicule4 = Car4()

        if(v is Vehicule4) {
            println("C'est un vehicule")

            when(v) {
                is Car4 -> println(" de type voiture")
                is Moto4 -> println(" de type moto")
                is Bicycle2 -> println(" de type velo")
            }
        }

        if(v is Bicycle2) {
            v.wheeling()
        } else {
            println(" ne peut pas faire de trick")
        }

        (v as? Bicycle2)?.wheeling()

        val bike = v as? Bicycle2
        bike?.wheeling()

        var vehicule : Vehicule4
        vehicule = Car4()
        vehicule.showWheels()
        vehicule.honk()
        vehicule = Moto4()
        vehicule.showWheels()
        vehicule.honk()
    }
}