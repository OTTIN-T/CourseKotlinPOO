package com.example.coursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

interface SwimmingPool {
    fun addSwimmingPool()
}

interface Garden {
    fun addGarden()
}

interface Garage {
    fun addGarage()
}

abstract class Building() {
    fun surfaceSize(surface: Double): Double {
        return surface
    }

    fun totalRoom(roomCount: Int): Int {
        return roomCount
    }
}

class NewHouse(private val roomCount: Int, private val surface: Double): Building(), SwimmingPool, Garden, Garage  {
    private var haveSwimmingPool: Boolean = false
    private var haveGarage: Boolean = false
    private var haveGarden: Boolean = false

    override fun addSwimmingPool() {
        haveSwimmingPool = true
    }

    override fun addGarden() {
        haveGarden = true
    }

    override fun addGarage() {
        haveGarage = true
    }



    override fun toString(): String {
        var description = "Cette maison a ${totalRoom(roomCount)} pièces"
        description += "avec une surface de ${surfaceSize(surface)}"
        if (haveGarage) {
            description += " et un garage"
        }
        if (haveGarden) {
            description += " et un jardin"
        }
        if (haveSwimmingPool) {
            description += " et une piscine"
        }
        description += "."
        return description
    }
}

class House : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house)

        val myHouse = NewHouse(4, 120.4)
        myHouse.addSwimmingPool()
        myHouse.addGarden()
        myHouse.addGarage()
        println(myHouse.toString())
    }
}