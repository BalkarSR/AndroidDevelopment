package com.example.balkarrana.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usernameInput = (EditText)findViewById(R.id.username);
        final String userText = usernameInput.getText().toString();
        final Button userButtonVariable = (Button)findViewById(R.id.userButton);

        EditText passwordInput = (EditText)findViewById(R.id.username);
        final String passText = passwordInput.getText().toString();
        final Button passButtonVariable = (Button)findViewById(R.id.passButton);

        final String userPassText = userText + passText;
        final Button userPassButtonVariable = (Button)findViewById(R.id.userPassButton);

        userButtonVariable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                userButtonVariable.setText(userText);
            }
        });

        passButtonVariable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passButtonVariable.setText(passText);
            }
        });

        userPassButtonVariable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                userPassButtonVariable.setText(userPassText);
            }
        });
    }

}
