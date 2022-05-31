package com.moringaschool.tukio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class addActivity extends AppCompatActivity {
    public static final String TAG = addActivity.class.getSimpleName();
    private EditText mName;
    //private EditText mConditionType;
    private EditText mConditionName;
    private EditText mCounty;
    private EditText mDiagnosisCentre;
    private Button mRegisterBtn;

    //Drop down arraylist
    Spinner spinner;
    String[] data = {"Select one","Neuro Related","Heart Related","Breathing Related","Digestive Related","Genetics Related","Muscular Related", "Nervous Related"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        mName = (EditText) findViewById(R.id.name);
        //mConditionType = (EditText) findViewById(R.id.conditionType);
        mConditionName = (EditText) findViewById(R.id.conditionName);
        mCounty = (EditText) findViewById(R.id.county);
        mDiagnosisCentre = (EditText) findViewById(R.id.diagnosisCentre);
        mRegisterBtn = (Button) findViewById(R.id.registerBtn);

        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               // Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


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

                Intent intent = new Intent(addActivity.this, RegistrationActivity.class);
                intent.putExtra("name", name);
                //intent.putExtra("conditionType", conditionType);
                intent.putExtra("conditionName", conditionName);
                intent.putExtra("county", county);
                intent.putExtra("diagnosisCentre", diagnosisCentre);
                startActivity(intent);
            }
        });

    }
}