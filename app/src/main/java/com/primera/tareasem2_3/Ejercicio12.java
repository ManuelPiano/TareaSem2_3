package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ejercicio12 extends AppCompatActivity {
    private EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio12);

        et = findViewById(R.id.et12);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et.setText(prefe.getString("mail",""));
    }
    public void ejecutar (View view){
        SharedPreferences preferencias = getSharedPreferences("datos" , Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("mail" ,et.getText().toString());
        editor.commit();
        finish();
    }
}