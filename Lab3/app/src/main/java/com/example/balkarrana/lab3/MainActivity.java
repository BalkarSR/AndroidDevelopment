package com.example.balkarrana.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button userBtn = findViewById(R.id.userButton);
        final Button passBtn = findViewById(R.id.passButton);
        final Button loginBtn = findViewById(R.id.loginButton);
        final EditText userTxt = findViewById(R.id.username);
        final EditText passTxt = findViewById(R.id.password);

        userBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                intent.putExtra("userExtra", userTxt.getText().toString());
                startActivity(intent);
            }
        });

        passBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PassActivity.class);
                intent.putExtra("passExtra", passTxt.getText().toString());
                startActivity(intent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.putExtra("userExtra", userTxt.getText().toString());
                intent.putExtra("passExtra", passTxt.getText().toString());
                startActivity(intent);
            }
        });
    }
}
