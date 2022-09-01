package com.primera.tareasem2_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ejercicio1 extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
        btn = findViewById(R.id.sumar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1 = et1.getText().toString();
                String valor2 = et2.getText().toString();
                int nro1 = Integer.parseInt(valor1);
                int nro2 = Integer.parseInt(valor2);
                int suma = nro1+nro2;
                String resul = String.valueOf(suma);
                tv1.setText(resul);
            }
        });
    }

}