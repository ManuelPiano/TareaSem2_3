package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ejercicio3 extends AppCompatActivity {
    private EditText ete1, ete2;
    private CheckBox ch1, ch2;
    public Button btn;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        ete1 = findViewById(R.id.et1);
        ete2 = findViewById(R.id.et2);
        ch1 = findViewById(R.id.c1);
        ch2 = findViewById(R.id.c2);
        res = findViewById(R.id.tv3);
        btn = findViewById(R.id.btnope);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = ete1.getText().toString();
                String n2 = ete2.getText().toString();
                int nro1 = Integer.parseInt(n1);
                int nro2 = Integer.parseInt(n2);
                String resultado = "";
                if (ch1.isChecked()) {
                    int suma = nro1 + nro2;
                     resultado = "la suma es: " + suma ;

                }else{
                    if (ch2.isChecked()) {
                        int resta = nro1 - nro2;
                        resultado = resultado + "la resta es: " + resta;

                    }
                }res.setText(resultado);


            }
        });
    }
}