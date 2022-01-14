package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ToggleButton
class LeagueActivity : BaseActivity() {
    var selectedLeague:String = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        val nextButton = findViewById<Button>(R.id.button4)
        nextButton.setOnClickListener {
            nextScreen()
        }
    }
    private fun nextScreen(){
        val intent = Intent(this,SkillSelectionActivity::class.java)
        startActivity(intent)
    }
     fun onMensClick(view: View){
        var womenBtn = findViewById<ToggleButton>(R.id.womenLeagueBtn)
        var mixedBtn = findViewById<ToggleButton>(R.id.mixedLeagueBtn)
        womenBtn.isChecked = false;
        mixedBtn.isChecked = false;
        selectedLeague = "Mens";
    }
     fun onWomenClick(view: View){
        var mensBtn = findViewById<ToggleButton>(R.id.mensLeagueBtn)
        var mixedBtn = findViewById<ToggleButton>(R.id.mixedLeagueBtn)
        mensBtn.isChecked = false;
        mixedBtn.isChecked = false;
        selectedLeague = "Women";
    }
     fun onMixedClick(view: View){
        var mensBtn = findViewById<ToggleButton>(R.id.mensLeagueBtn)
        var womenBtn = findViewById<ToggleButton>(R.id.womenLeagueBtn)
        womenBtn.isChecked = false;
        mensBtn.isChecked = false;
        selectedLeague = "Mixed";
    }
}