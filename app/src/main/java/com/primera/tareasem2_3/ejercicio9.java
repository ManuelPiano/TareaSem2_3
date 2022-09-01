package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ejercicio9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);
    }
    public void acercade (View view){
        Intent i = new Intent(this, ejercicio9_1.class);
        startActivity(i);
    }
}