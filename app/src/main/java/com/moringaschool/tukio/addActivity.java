package com.moringaschool.tukio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addActivity extends AppCompatActivity {
    public static final String TAG = addActivity.class.getSimpleName();
    private EditText mName;
    private EditText mConditionType;
    private EditText mConditionName;
    private EditText mCounty;
    private EditText mDiagnosisCentre;
    private Button mRegisterBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        mName = (EditText) findViewById(R.id.name);
        mConditionType = (EditText) findViewById(R.id.conditionType);
        mConditionName = (EditText) findViewById(R.id.conditionName);
        mCounty = (EditText) findViewById(R.id.county);
        mDiagnosisCentre = (EditText) findViewById(R.id.diagnosisCentre);
        mRegisterBtn = (Button) findViewById(R.id.registerBtn);

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                //*Log.d(TAG, name);
                String conditionType = mConditionType.getText().toString();
                //Log.d(TAG,conditionType);
                String conditionName = mConditionName.getText().toString();
                //Log.d(TAG,conditionName);
                String county= mCounty.getText().toString();
                //Log.d(TAG,county);
                String diagnosisCentre = mDiagnosisCentre.getText().toString();
                //Log.d(TAG,diagnosisCentre);

                Intent intent = new Intent(addActivity.this, RegistrationActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("conditionType", conditionType);
                intent.putExtra("conditionName", conditionName);
                intent.putExtra("county", county);
                intent.putExtra("diagnosisCentre", diagnosisCentre);
                startActivity(intent);
            }
        });


    }
}