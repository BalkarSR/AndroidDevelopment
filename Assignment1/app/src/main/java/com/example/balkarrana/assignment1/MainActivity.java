package com.example.balkarrana.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup, radioGroup2, radioGroup3;
    Button button, button2, button3;
    TextView textView, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton){
                    Toast.makeText(getApplicationContext(), "Alice", Toast.LENGTH_SHORT).show();
                }

                if(checkedId == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(), "Bob", Toast.LENGTH_SHORT).show();
                }
                if(checkedId == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(), "Carol", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group2, int checkedId) {
                if(checkedId == R.id.helloRadioButton){
                    Toast.makeText(getApplicationContext(), "Dave", Toast.LENGTH_SHORT).show();
                }

                if(checkedId == R.id.helloRadioButton2){
                    Toast.makeText(getApplicationContext(), "Eve", Toast.LENGTH_SHORT).show();
                }

                if(checkedId == R.id.helloRadioButton3){
                    Toast.makeText(getApplicationContext(), "Fred", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group3, int checkedId) {
                if(checkedId == R.id.bonjourRadioButton){
                    Toast.makeText(getApplicationContext(), "Gina", Toast.LENGTH_SHORT).show();
                }

                if(checkedId == R.id.bonjourRadioButton2){
                    Toast.makeText(getApplicationContext(), "Henry", Toast.LENGTH_SHORT).show();
                }

                if(checkedId == R.id.bonjourRadioButton3){
                    Toast.makeText(getApplicationContext(), "Ingrid", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int changedRadio = radioGroup.getCheckedRadioButtonId();
                if(changedRadio == R.id.radioButton){
                    textView.setText("Hi Alice");
                }

                if(changedRadio == R.id.radioButton2){
                    textView.setText("Hi Bob");
                }

                if(changedRadio == R.id.radioButton3){
                    textView.setText("Hi Carol");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int changedRadio = radioGroup2.getCheckedRadioButtonId();
                if(changedRadio == R.id.helloRadioButton){
                    textView2.setText("Hello Dave");
                }

                if(changedRadio == R.id.helloRadioButton2){
                    textView2.setText("Hello Eve");
                }

                if(changedRadio == R.id.helloRadioButton3){
                    textView2.setText("Hello Fred");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int changedRadio = radioGroup3.getCheckedRadioButtonId();
                if(changedRadio == R.id.bonjourRadioButton){
                    textView3.setText("Bonjour Gina");
                }

                if(changedRadio == R.id.bonjourRadioButton2){
                    textView3.setText("Bonjour Henry");
                }

                if(changedRadio == R.id.bonjourRadioButton3){
                    textView3.setText("Bonjour Ingrid");
                }
            }
        });

    }
}
