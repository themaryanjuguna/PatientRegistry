package com.moringaschool.tukio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    public static final String TAG = RegistrationActivity.class.getSimpleName();

    private TextView mApplicantsName;
    private TextView mConditionTypeTV;
    private TextView mConditionNameTV;
    private TextView mCountyTV;
    private TextView mDiagnosisCentreTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mApplicantsName = (TextView) findViewById(R.id.applicantsName);
        mConditionTypeTV = (TextView) findViewById(R.id.conditionTypeTV);
        mConditionNameTV = (TextView) findViewById(R.id.conditionNameTV);
        mCountyTV = (TextView) findViewById(R.id.countyTV);
        mDiagnosisCentreTV = (TextView) findViewById(R.id.diagnosisCentreTV);

        Intent intent = getIntent();
        String applicantsName = intent.getStringExtra("applicantsName");
        mApplicantsName.setText("Applicants Name: " + applicantsName);

        String conditionTypeTV = intent.getStringExtra("conditionTypeTV");
        mConditionTypeTV.setText("Type of Condition: " + conditionTypeTV);

        String conditionNameTV = intent.getStringExtra("conditionNameTV");
        mConditionNameTV.setText("Name of the Condition: " + conditionNameTV);

        String countyTV = intent.getStringExtra("countyTV");
        mCountyTV.setText("County of Origin " + countyTV);

        String diagnosisCentreTV = intent.getStringExtra("diagnosisCentreTV");
        mDiagnosisCentreTV.setText("Name of Diagnosis: " + diagnosisCentreTV);


    }

}
