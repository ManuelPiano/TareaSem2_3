package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ejercicio10 extends AppCompatActivity {
    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);
        et1 = findViewById(R.id.et10);

    }
    public void verificar (View view){
        String clave = et1.getText().toString();
        String password = "abc123";
        if (clave.equals(password)){
            Intent intent = new Intent(getApplicationContext(),
                    bienvenido.class);
            startActivity(intent);
            Toast notification =Toast.makeText(this,"Bienvenido",Toast.LENGTH_LONG);
            notification.show();

        }else{
            Toast notification =Toast.makeText(this,"Clave invalida",Toast.LENGTH_LONG);
            notification.show();

        }
    }
}