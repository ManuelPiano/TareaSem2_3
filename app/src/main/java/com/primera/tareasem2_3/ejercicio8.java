package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ejercicio8 extends AppCompatActivity {
    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);

        et1 = findViewById(R.id.user);
        et2 = findViewById(R.id.ps);

    }
    public void verificar (View view){
        String clave = et2.getText().toString();
        if (clave.length()==0){
        Toast notification = Toast.makeText(this, "La clave no puede quedar vacía",Toast.LENGTH_LONG);
        notification.show();
        }
    }
}