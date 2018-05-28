package com.example.kirill_korygin.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText nameEdit;
    private EditText passEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Login

                nameEdit = findViewById(R.id.nameEdit);
                passEdit = findViewById(R.id.passEdit);
                String name = nameEdit.getText().toString();
                String pass = passEdit.getText().toString();
                String val = name + ", " + pass;

                if (val.compareToIgnoreCase("Student, 123") == 0)
                {
                    Intent startIntent = new Intent(getApplicationContext(), CalcActivity.class);
                    startActivity(startIntent);
                    finish();

                }
            }
        });

    }
}
