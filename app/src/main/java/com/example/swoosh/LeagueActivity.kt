package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LeagueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        val nextButton = findViewById<Button>(R.id.button4)
        nextButton.setOnClickListener {
            nextScreen();
        }
    }
    fun nextScreen(){
        val intent = Intent(this,SkillSelectionActivity::class.java);
        startActivity(intent);
    }
}