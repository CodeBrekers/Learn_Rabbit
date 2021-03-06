package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main_UI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ui);

        getSupportActionBar().hide();


    }
    public void openCount(View view){
        Intent intent1 = new Intent(Main_UI.this, MathsMain.class);

        startActivity(intent1);
    }
    public void openTime(View view){
        Intent intent1 = new Intent(Main_UI.this, DisplayData.class);

        startActivity(intent1);
    }
    public void openMulti(View view){
        Intent intent1 = new Intent(Main_UI.this, addFactors.class);

        startActivity(intent1);
    }
    public void openCards(View view){
        Intent intent1 = new Intent(Main_UI.this, ImageUI.class);

        startActivity(intent1);
    }
    public void openContact(View view){
        Intent intent1 = new Intent(Main_UI.this, ContactUpdate.class);

        startActivity(intent1);
    }
    public void openStory(View view){
        Intent intent1 = new Intent(Main_UI.this, StoryMain.class);

        startActivity(intent1);
    }
    public void openDictionary(View view){
        Intent intent1 = new Intent(Main_UI.this, Dictionary.class);

        startActivity(intent1);
    }
}