package com.adrian.tecmilenio.doctorsappointment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner bloodTypeSpinner = (Spinner) findViewById(R.id.bloodType);

        ArrayAdapter<CharSequence> bloodTypeAdapter = ArrayAdapter.createFromResource(this, R.array.blood_type,
                android.R.layout.simple_spinner_item);

        bloodTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        bloodTypeSpinner.setAdapter(bloodTypeAdapter);
    }
}
