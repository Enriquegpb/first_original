package com.enrique.firstoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void onClick(View v) {
        Intent intent=new Intent (Signup.this, MainActivity.class);
        startActivity(intent);
    }
    public void openMain2(View v){
        Intent intent=new Intent(Signup.this,MainActivity.class);
        startActivity(intent);
    }
}