package com.example.balkarrana.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userText = findViewById(R.id.username), passText = findViewById(R.id.password);
        final Button userButton = findViewById(R.id.userButton);
        final Button passButton = findViewById(R.id.passButton);
        final Button userPassButton = findViewById(R.id.userPassButton);

        userButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                userButton.setText(userText.getText().toString());
            }

        });

        passButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                passButton.setText(passText.getText().toString());
            }

        });

        userPassButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                userPassButton.setText(userText.getText().toString() + "-" + passText.getText().toString());
            }

        });

    }

}
