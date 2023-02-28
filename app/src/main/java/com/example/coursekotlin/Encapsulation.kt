package com.example.coursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class Account {
    protected var balance: Int = 0
    open fun deposit(value: Int) {
        balance += value
        val prefix = if(value >= 0) "+" else ""
        println("$prefix $value $ sur le compte. Nouveau solde: $balance")
    }
}

class PositiveAccount: Account() {
    override fun deposit(value: Int) {
        if(!isValidDepot(value)) {
            println("Opération négative interdit.")
        }
        super.deposit(value)
    }

    private fun isValidDepot(value: Int): Boolean {
        return balance + value >= 0
    }
}



class Encapsulation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encapsulation)

        println("Compte positif")
        val account = Account()
        account.deposit(50)
        println("Compte Négatif")
        val positiveAccount = PositiveAccount()
        positiveAccount.deposit(40)
        positiveAccount.deposit(-100)
        positiveAccount.deposit(-5)
    }
}