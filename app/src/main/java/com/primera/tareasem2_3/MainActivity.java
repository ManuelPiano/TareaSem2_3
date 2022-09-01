package com.primera.tareasem2_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
     //   MenuInflater menuInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu,menu);
    //    menuInflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ej1:
                Toast.makeText(this, "Ejercicio 1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio1.class));
                return true;
            case R.id.ej2:
                Toast.makeText(this, "Ejercicio 2", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio2.class));
                return true;
            case R.id.ej3:
                Toast.makeText(this, "Ejercicio 3", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio3.class));
                return true;
            case R.id.ej4:
                Toast.makeText(this, "Ejercicio 4", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio4.class));
                return true;
            case R.id.ej5:
                Toast.makeText(this, "Ejercicio 5", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio5.class));
                return true;
            case R.id.ej6:
                Toast.makeText(this, "Ejercicio 6", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio6.class));
                return true;
            case R.id.ej7:
                Toast.makeText(this, "Ejercicio 7", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio7.class));
                return true;
            case R.id.ej8:
                Toast.makeText(this, "Ejercicio 8", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio8.class));
                return true;
            case R.id.ej9:
                Toast.makeText(this, "Ejercicio 9", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio9.class));
                return true;
            case R.id.ej10:
                Toast.makeText(this, "Ejercicio 10", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio10.class));
                return true;
            case R.id.ej11:
                Toast.makeText(this, "Ejercicio 11", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio11.class));
                return true;
            case R.id.ej12:
                Toast.makeText(this, "Ejercicio 12", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Ejercicio12.class));
                return true;
            case R.id.ej13:
                Toast.makeText(this, "Ejercicio 13", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ejercicio13.class));
                return true;
            default:return super.onOptionsItemSelected(item);
        }

    }
}