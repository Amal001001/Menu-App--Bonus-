package com.example.menuappbonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var main:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main = findViewById(R.id.mainlayout)
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.main_menu, menu)
            return true
        }
        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                R.id.home -> {
                    val intent = Intent(this, home::class.java)
                    startActivity(intent)
                    return true
                }
                R.id.about -> {
                    val intent = Intent(this, about::class.java)
                    startActivity(intent)
                    return true
                }
                R.id.help -> {
                    val intent = Intent(this, help::class.java)
                    startActivity(intent)
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        }

}