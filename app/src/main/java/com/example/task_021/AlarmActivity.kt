package com.example.task_021

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlin.system.exitProcess

class AlarmActivity : AppCompatActivity() {

    private lateinit var stopAlarmButtonBTN: Button
    private lateinit var toolbarMain: Toolbar
    private lateinit var imageViewIV: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        init()

        setSupportActionBar(toolbarMain)
        title = "Будильник."

        imageViewIV.setImageResource(R.drawable.male_boxer)

        stopAlarmButtonBTN.setOnClickListener{
            finish()
            exitProcess(0)
        }
    }

    private fun init() {
        toolbarMain = findViewById(R.id.toolbarMain)
        stopAlarmButtonBTN = findViewById(R.id.stopAlarmButtonBTN)
        imageViewIV = findViewById(R.id.imageViewIV)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return  true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.exitMenuMain->{
                moveTaskToBack(true);
                exitProcess(-1)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}