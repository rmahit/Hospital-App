package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

    e1=(EditText)findViewById(R.id.nam);
    e2=(EditText) findViewById(R.id.add);
    e3=(EditText) findViewById(R.id.pcode);
    e4=(EditText) findViewById(R.id.mobno);
    e5=(EditText) findViewById(R.id.unam);
    e6=(EditText) findViewById(R.id.pword);
    e7=(EditText) findViewById(R.id.confpass);
    b1=(Button) findViewById(R.id.sbutt);
    b2=(Button) findViewById(R.id.logbutt);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o);
            }
        });


    }
}