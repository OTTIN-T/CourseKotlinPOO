package com.example.coursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class User2(val name: String, val age: Int) {
    override fun toString(): String {
        return "name: $name, age: $age"
    }

}

class DataClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_class)

        val robin = User2("Robin", 23)
        println("info sur Robin: $robin")

        val tim = User2("Tim", 23)
        println("info sur Tim: $tim")

        val styve = robin.copy("Styve")
        println("info sur Styve: $styve")

        if(robin == styve) {
            println("ils sont jumeaux")
        } else {
            println("ils ne sont pas de la meme famille")
        }
    }
}
