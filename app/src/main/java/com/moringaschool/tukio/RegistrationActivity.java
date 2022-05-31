package com.moringaschool.tukio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    public static final String TAG = RegistrationActivity.class.getSimpleName();

    private TextView mApplicantsName;
    private  TextView mConditionTypeTV;
    private  TextView mConditionNameTV;
    private  TextView mCountyTV;
    private  TextView mDiagnosisCentreTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mApplicantsName = (TextView) findViewById(R.id.applicantsname);
        mConditionTypeTV = (TextView) findViewById(R.id.conditiontypeTV);
        mConditionNameTV = (TextView) findViewById(R.id.conditionnameTV);
        mCountyTV = (TextView) findViewById(R.id.countyTV);
        mDiagnosisCentreTV = (TextView) findViewById(R.id.diagnosiscentreTV);

        Intent intent = getIntent();
        String applicantsname = intent.getStringExtra("applicantsname");
        String conditiontypeTV = intent.getStringExtra("conditiontypeTV");
        String conditionnameTV = intent.getStringExtra("conditionnameTV");
        String countyTV = intent.getStringExtra("countyTV");
        String diagnosiscentreTV = intent.getStringExtra("diagnosiscentreTV");


        mApplicantsName.setText("Applicants Name: " + applicantsname);
        mConditionTypeTV.setText("Type of Condition: " + conditiontypeTV);
        mConditionNameTV.setText("Name of the Condition: " + conditionnameTV);
        mCountyTV.setText("County of Origin " + countyTV);
        mDiagnosisCentreTV.setText("Name of Diagnosis: " + diagnosiscentreTV);


    }

}
