package com.moringaschool.tukio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String conditiontype = intent.getStringExtra("conditiontype");
        String conditionname = intent.getStringExtra("conditionname");
        String county = intent.getStringExtra("county");
    }

}