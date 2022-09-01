package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ejercicio6 extends AppCompatActivity {
    private TextView tv6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);
        tv6 = findViewById(R.id.tv6);

    }
    public void llamar (View view){
        tv6.setText("Llamando");
    }
}