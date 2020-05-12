package com.example.updatedandliteregisterationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bt;
Spinner sp,sp1;
String [] s={"Select","Haryana","Goa","Punjab","Jammu and Kashmir","Uttar Pradesh"};
String [] s1 ={"Select","Hiaar","Rohtak","Gurgaon","Faridabad","Hansi","Sirsa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.bt);
        sp = findViewById(R.id.sp);
        sp1 = findViewById(R.id.sp1);

        ArrayAdapter<String> ad = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,s);
        ArrayAdapter<String> ad1 = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,s1);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ad1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);
        sp1.setAdapter(ad1);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast.makeText(MainActivity.this,"HR",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"Goa",Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast.makeText(MainActivity.this,"hisar",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"Rohtak",Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
