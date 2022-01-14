package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton

class SkillSelectionActivity : BaseActivity() {
    var selectedSkill:String = "";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_selection)
        val finishBtn = findViewById<Button>(R.id.finishBtn)
        finishBtn.setOnClickListener {
            if(selectedSkill == ""){
                Toast.makeText(this,"Please select a skill",Toast.LENGTH_SHORT).show();
            }
        }
    }
    fun onBeginnerClick(view: View){
        var proBtn = findViewById<ToggleButton>(R.id.proBtn)
        proBtn.isChecked = false;
        selectedSkill = "Beginner";
    }
    fun onProClick(view: View){
        var beginnerBtn = findViewById<ToggleButton>(R.id.beginnerBtn)
        beginnerBtn.isChecked = false;
        selectedSkill = "Pro";
    }
}