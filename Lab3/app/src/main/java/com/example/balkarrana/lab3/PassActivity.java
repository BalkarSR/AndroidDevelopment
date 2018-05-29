package com.example.balkarrana.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        Intent intent = getIntent();

        final Button homeBtn = findViewById(R.id.homeButton);
        final TextView passTextView = findViewById(R.id.passText);
        final String passString = intent.getStringExtra("passExtra");

        passTextView.setText("password is " + passString);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(PassActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
