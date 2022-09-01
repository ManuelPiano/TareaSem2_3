package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ejercicio13 extends AppCompatActivity {
private EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13);
        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);
    }
    public void grabar(View view){
        String nombre = e1.getText().toString();
        String datos = e2.getText().toString();
        SharedPreferences preferences = getSharedPreferences("Agenda" , Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(nombre, datos);
        editor.commit();
        Toast.makeText(this, "Datos grabados", Toast.LENGTH_LONG).show();

    }
    public void recuperar (View view){
        String nombre = e1.getText().toString();
        SharedPreferences preferences = getSharedPreferences("Agenda" , Context.MODE_PRIVATE);
        String d = preferences.getString(nombre , "");
        if (d.length()==0) {
            Toast.makeText(this, "No existe dicho nombre en la agenda",Toast.LENGTH_LONG).show();

        }else{
            e2.setText(d);
        }

    }
}