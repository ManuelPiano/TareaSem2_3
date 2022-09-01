package com.primera.tareasem2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class webview extends AppCompatActivity {
    private WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        wb = findViewById(R.id.webview1);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        wb.loadUrl("http://"+dato);
    }
    public void finalizar (View view){
        finish();
    }
}