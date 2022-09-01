package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ejercicio4 extends AppCompatActivity  {
    private Spinner spin1;
    private EditText et1, et2;
    private Button btnspi;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btnspi = findViewById(R.id.btnope);
        res = findViewById(R.id.tv2);

        spin1 = findViewById(R.id.spinner);
        String []opciones = {"sumar", "restar","multiplicar","dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spin1.setAdapter(adapter);

    }
    public void Calcular (View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1);
        int valor2_int = Integer.parseInt(valor2);

        String seleccion = spin1.getSelectedItem().toString();
        if (seleccion.equals("sumar")){
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            res.setText(resultado);
        }else if (seleccion.equals("restar")){
            int restar = valor1_int - valor2_int;
            String resultado = String.valueOf(restar);
            res.setText(resultado);
        }else if(seleccion.equals("multiplicar")){
            int multi = valor1_int + valor2_int;
            String resultado = String.valueOf(multi);
            res.setText(resultado);
        }else if(seleccion.equals("dividir")){
            if (valor2_int != 0){
            int div = valor1_int / valor2_int;
            String resultado = String.valueOf(div);
            res.setText(resultado);
        }else{
                Toast.makeText(this, "No se puede dividir entre cero" , Toast.LENGTH_LONG).show();
            }
        }
    }
}