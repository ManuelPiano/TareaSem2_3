package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ejercicio2 extends AppCompatActivity {
    private EditText ete1, ete2;
    private RadioButton r1, r2;
    private Button btn;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        ete1 = findViewById(R.id.et1);
        ete2 = findViewById(R.id.et2);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        res = findViewById(R.id.tv2);
        btn = findViewById(R.id.btnop);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = ete1.getText().toString();
                String n2 = ete2.getText().toString();
                int nro1 = Integer.parseInt(n1);
                int nro2 = Integer.parseInt(n2);
                if (r1.isChecked()==true) {
                    int suma = nro1 + nro2;
                    String resu = String.valueOf(suma);
                    res.setText(resu);
                }else{
                    if (r2.isChecked()==true) {
                        int resta = nro1 - nro2;
                        String resu = String.valueOf(resta);
                        res.setText(resu);
                    }
                }


            }
        });

    }
}