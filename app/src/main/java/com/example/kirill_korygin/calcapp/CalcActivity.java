package com.example.kirill_korygin.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button addB = findViewById(R.id.buttonAdd);
        Button subB = findViewById(R.id.buttonSub);
        Button multB = findViewById(R.id.buttonMult);
        Button divB = findViewById(R.id.buttonDiv);




        addB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = findViewById(R.id.editText);
                EditText e2 = findViewById(R.id.editText2);

                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                EditText sumText = findViewById(R.id.editSum);

                sumText.setText(num1 + num2 + "");
            }
        });


        subB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = findViewById(R.id.editText);
                EditText e2 = findViewById(R.id.editText2);

                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                EditText sumText = findViewById(R.id.editSum);

                sumText.setText(num1 - num2 + "");
            }
        });

        multB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = findViewById(R.id.editText);
                EditText e2 = findViewById(R.id.editText2);

                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                EditText sumText = findViewById(R.id.editSum);

                sumText.setText(num1 * num2 + "");
            }
        });


        divB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = findViewById(R.id.editText);
                EditText e2 = findViewById(R.id.editText2);

                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                EditText sumText = findViewById(R.id.editSum);

                sumText.setText(num1 / num2 + "");
            }
        });
    }
}
