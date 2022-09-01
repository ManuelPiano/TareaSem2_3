package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ejercicio7 extends AppCompatActivity {
    private EditText et1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        et1 = findViewById(R.id.et6);
        num = (int)(Math.random()*100001);
        String cadena = String.valueOf(num);
        Toast notification = Toast.makeText(this, cadena, Toast.LENGTH_LONG);
        notification.show();
    }
    public void controlar (View view){
        String VI = et1.getText().toString();
        int valor = Integer.parseInt(VI);
        if (valor == num){
            Toast notification = Toast.makeText(this, "Muy bien recordaste el numero mostrado",Toast.LENGTH_LONG);
            notification.show();
        }else{
            Toast notification = Toast.makeText(this, "Lo siento, no recordaste el numero",Toast.LENGTH_LONG);
            notification.show();
        }
    }
}