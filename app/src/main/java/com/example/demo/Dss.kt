package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.view.SwitchButton
import kotlinx.android.synthetic.main.activity_dss.*
import kotlinx.android.synthetic.main.activity_homepage.*
import kotlinx.android.synthetic.main.activity_homepage.drawerLayout
import kotlinx.android.synthetic.main.activity_homepage.navView
import kotlinx.android.synthetic.main.activity_subscription.*


class Dss : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dss)

        btnBreathing.setOnClickListener {
            var intent: Intent = Intent(this@Dss, QuestionActivity::class.java)
            intent.putExtra("type", "Breathing")
            startActivity(intent)
        }
        btn_Vomiting_Diarrhoea.setOnClickListener {
            var intent: Intent = Intent(this@Dss, QuestionActivity::class.java)
            intent.putExtra("type", "Vomiting")
            startActivity(intent)
        }

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miItem1 -> startActivity(Intent(this, MyPets::class.java))
                R.id.miItem2 -> startActivity(Intent(this, vaccination::class.java))
                R.id.miItem3 -> startActivity(Intent(this, Medication::class.java))
                R.id.miItem4 -> startActivity(Intent(this, CheckUps::class.java))
                R.id.miItem5 -> startActivity(Intent(this, News::class.java))
                R.id.miItem6 -> startActivity(Intent(this, ParasitePrevention::class.java))
                R.id.miItem7 -> startActivity(Intent(this, Subscription::class.java))
                R.id.miItem8 -> startActivity(Intent(this, ContactUs::class.java))
                R.id.miItem9 -> startActivity(Intent(this, AccountSetting::class.java))
                R.id.miItem10 -> startActivity(Intent(this, Dss::class.java))
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

}