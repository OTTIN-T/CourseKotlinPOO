package com.example.coursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Bag(private val itemsCount: Int, val name: String) {
    class Item(private val weight: Int) {
        fun showWeight() {
            println("Poid de mon item: $weight")
        }
    }

    val items = arrayOfNulls<Item>(itemsCount)
}

class Car5(val wheelsCount: Int) {
    inner class Engine {
        fun displayHorsePower() {
            println("La voiture a une puissance de: ${wheelsCount * 50}")
        }
    }
}

class NestedInner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nested_inner)

        val bag = Bag(5, "bag 1")
        val firstItem = Bag.Item(50)
        firstItem.showWeight()
        bag.items[0] = Bag.Item(50)
        bag.items[1] = Bag.Item(100)

        val car = Car5(4)
        car.Engine().displayHorsePower()
    }
}