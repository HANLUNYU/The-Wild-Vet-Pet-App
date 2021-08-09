package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homepage.*

class Homepage : AppCompatActivity(){

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)



        btnMyPets.setOnClickListener {
            startActivity(Intent(this, MyPets::class.java))
        }

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miItem1 -> startActivity(Intent(this, MyPets::class.java))
                R.id.miItem2 -> Toast.makeText(applicationContext,
                    "Click Item 2", Toast.LENGTH_SHORT).show()
                R.id.miItem3 -> Toast.makeText(applicationContext,
                    "Click Item 3", Toast.LENGTH_SHORT).show()
                R.id.miItem4 -> Toast.makeText(applicationContext,
                    "Click Item 4", Toast.LENGTH_SHORT).show()
                R.id.miItem5 -> Toast.makeText(applicationContext,
                    "Click Item 5", Toast.LENGTH_SHORT).show()
                R.id.miItem6 -> Toast.makeText(applicationContext,
                    "Click Item 6", Toast.LENGTH_SHORT).show()
                R.id.miItem7 -> Toast.makeText(applicationContext,
                    "Click Item 7", Toast.LENGTH_SHORT).show()
                R.id.miItem8 -> Toast.makeText(applicationContext,
                    "Click Item 8", Toast.LENGTH_SHORT).show()
                R.id.miItem9 -> Toast.makeText(applicationContext,
                    "Click Item 9", Toast.LENGTH_SHORT).show()
                R.id.miItem10 -> Toast.makeText(applicationContext,
                    "Click Item 10", Toast.LENGTH_SHORT).show()
                R.id.miItem11 -> startActivity(Intent(this, Homepage::class.java))
                R.id.miItem12 -> startActivity(Intent(this, MainActivity::class.java))
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.searchview, menu);
        return true
    }

}