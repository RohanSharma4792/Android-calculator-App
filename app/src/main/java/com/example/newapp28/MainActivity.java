package com.example.newapp28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView3, textView2;
    Button button, button1, button2, button3, button4, button5, button6, button7, button8, button9, plus, multiply, clr;
    EditText editTextNumber1, editTextNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        plus = findViewById(R.id.plus);
        multiply = findViewById(R.id.multiply);
        clr = findViewById(R.id.clr);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber1 = findViewById(R.id.editTextNumber1);

        int num1 = Integer.parseInt(String.valueOf(editTextNumber));
        int num2 = Integer.parseInt(String.valueOf(editTextNumber1));




    }
}