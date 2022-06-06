package com.maryannenjuguna.PatientRegistry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class addActivity extends AppCompatActivity {
    public static final String TAG = addActivity.class.getSimpleName();
    private TextInputLayout mName;
    private TextInputLayout mConditionName;
    private TextInputLayout dropdown;
    private TextInputLayout mCounty;
    private TextInputLayout mDiagnosisCentre;
    private Button mRegisterBtn;


    AutoCompleteTextView autoCompleteCondition;
    AutoCompleteTextView autoCompleteName;
    AutoCompleteTextView countyAC;
    AutoCompleteTextView conditionNameAC;
    AutoCompleteTextView diagnosisCentreAC;


    ArrayList<String> arrayList_conditions;
    ArrayAdapter<String> arrayAdapter_conditions;

    //Drop down arraylist
    String[] data = {"Select one","Neuro Related","Heart Related","Breathing Related","Digestive Related","Genetics Related","Muscular Related", "Nervous Related"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        dropdown=(TextInputLayout)findViewById(R.id.dropdown);
        autoCompleteCondition=(AutoCompleteTextView) findViewById(R.id.autoCompleteCondition);

        ArrayAdapter type = new ArrayAdapter(addActivity.this, android.R.layout.simple_dropdown_item_1line,data);
        autoCompleteCondition.setAdapter(type);


        mName = (TextInputLayout) findViewById(R.id.name);
        autoCompleteName=(AutoCompleteTextView) findViewById(R.id.autoCompleteName);

        mConditionName = (TextInputLayout) findViewById(R.id.conditionName);
        conditionNameAC=(AutoCompleteTextView) findViewById(R.id.conditionNameAC);

        mCounty = (TextInputLayout) findViewById(R.id.county);
        countyAC=(AutoCompleteTextView) findViewById(R.id.countyAC);

        mDiagnosisCentre = (TextInputLayout) findViewById(R.id.diagnosisCentre);
        diagnosisCentreAC=(AutoCompleteTextView) findViewById(R.id.diagnosisCentreAC);

        mRegisterBtn = (Button) findViewById(R.id.registerBtn);

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = autoCompleteName.getText().toString();
                //Log.d(TAG, name);
                String conditionName = conditionNameAC.getText().toString();
                //Log.d(TAG,conditionName);
                String county= countyAC.getText().toString();
                //Log.d(TAG,county);
                String diagnosisCentre = diagnosisCentreAC.getText().toString();
                //Log.d(TAG,diagnosisCentre);
                String condition = autoCompleteCondition.getText().toString();
                //Log.d(TAG,condition);

                if(
                        name.equals("") || conditionName.equals("") || condition.equals("") || county.equals("") || diagnosisCentre.equals(""))
                {
                    Toast.makeText(addActivity.this,"FIELDS CANNOT BE EMPTY",Toast.LENGTH_SHORT).show();
                }else {

                    Intent intent = new Intent(addActivity.this, RegistrationActivity.class);
                    intent.putExtra("name", name);
                    //intent.putExtra("conditionType", conditionType);
                    intent.putExtra("conditionName", conditionName);
                    intent.putExtra("county", county);
                    intent.putExtra("diagnosisCentre", diagnosisCentre);
                    intent.putExtra("condition", condition);
                    startActivity(intent);

                }
            }
        });

    }
}