package com.moringaschool.tukio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class addActivity extends AppCompatActivity {
    public static final String TAG = addActivity.class.getSimpleName();
    private EditText mName;
    //private EditText mConditionType;
    private EditText mConditionName;
    private EditText mCounty;
    private EditText mDiagnosisCentre;
    private Button mRegisterBtn;

    TextInputLayout dropdown;
    AutoCompleteTextView autoComplete;

    ArrayList<String> arrayList_conditions;
    ArrayAdapter<String> arrayAdapter_conditions;

    //Drop down arraylist
    Spinner spinner;
    String[] data = {"Select one","Neuro Related","Heart Related","Breathing Related","Digestive Related","Genetics Related","Muscular Related", "Nervous Related"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        dropdown=(TextInputLayout)findViewById(R.id.dropdown);
        autoComplete=(AutoCompleteTextView) findViewById(R.id.autoComplete);

        ArrayAdapter type = new ArrayAdapter(addActivity.this, android.R.layout.simple_dropdown_item_1line,data);
        autoComplete.setAdapter(type);


        mName = (EditText) findViewById(R.id.name);
        //mConditionType = (EditText) findViewById(R.id.conditionType);
        mConditionName = (EditText) findViewById(R.id.conditionName);
        mCounty = (EditText) findViewById(R.id.county);
        mDiagnosisCentre = (EditText) findViewById(R.id.diagnosisCentre);
        mRegisterBtn = (Button) findViewById(R.id.registerBtn);

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                Log.d(TAG, name);
                //String conditionType = mConditionType.getText().toString();
                //Log.d(TAG,conditionType);
                String conditionName = mConditionName.getText().toString();
                Log.d(TAG,conditionName);
                String county= mCounty.getText().toString();
                Log.d(TAG,county);
                String diagnosisCentre = mDiagnosisCentre.getText().toString();
                Log.d(TAG,diagnosisCentre);
                String condition = autoComplete.getText().toString();


                Intent intent = new Intent(addActivity.this, RegistrationActivity.class);
                intent.putExtra("name", name);
                //intent.putExtra("conditionType", conditionType);
                intent.putExtra("conditionName", conditionName);
                intent.putExtra("county", county);
                intent.putExtra("diagnosisCentre", diagnosisCentre);
                intent.putExtra("condition", condition);
                startActivity(intent);
            }
        });

    }
}