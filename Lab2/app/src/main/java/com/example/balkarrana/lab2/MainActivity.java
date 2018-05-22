package com.example.balkarrana.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button userButton, passButton, userPassButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button userButton = findViewById(R.id.userButton);
        userButton.setOnClickListener(this);

        Button passButton = findViewById(R.id.passButton);
        passButton.setOnClickListener(this);

        Button userPassButton = findViewById(R.id.userPassButton);
        userPassButton.setOnClickListener(this);

    }

    public void onCreate(View v){

        EditText userText = findViewById(R.id.username), passText = findViewById(R.id.password);

        switch(v.getId()){

            case R.id.userButton:
                userButton.setText(userText.getText().toString());
                break;
            case R.id.passButton:
                passButton.setText(passText.getText().toString());
                break;
            case R.id.userPassButton:
                String userPass = userText.getText().toString() + "-" + passText.getText().toString();
                userPassButton.setText(userPass);
                break;
            default:
        }

    }

}
