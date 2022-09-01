package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ejercicio11 extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio11);
        et1 = findViewById(R.id.et11);

    }
    public void ver (View view){
        Intent i = new Intent(this, webview.class);
        i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }
}