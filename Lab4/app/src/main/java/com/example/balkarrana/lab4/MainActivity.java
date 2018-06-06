package com.example.balkarrana.lab4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    private ListView letArrayView;
    private ListView letArrayView2;

    private String[] letArray;
    private String[] letArray2;

    private char[] alphabet ="ABCDEFGHIJKLM".toCharArray();
    private char[] alphabet2 = "NOPQRSTUVWXYZ".toCharArray();


    private ArrayAdapter arrayAdapter;
    private ArrayAdapter arrayAdapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        letArrayView = (ListView)findViewById(R.id.lstPrev);
        letArrayView2 = (ListView)findViewById(R.id.lstCur);

        letArray = new String[13];
        letArray2 = new String[13];


        for(int i = 0; i < letArray.length; i++){
            letArray[i] = Character.toString(alphabet[i]);
        }

        for(int j = 0; j < letArray2.length; j++){
            letArray2[j] = Character.toString(alphabet2[j]);
        }

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,letArray);
        arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,letArray2);

        letArrayView.setAdapter(arrayAdapter);
        letArrayView2.setAdapter(arrayAdapter2);

    }

}
