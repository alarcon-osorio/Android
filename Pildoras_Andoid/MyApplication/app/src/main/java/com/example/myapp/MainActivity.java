package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador =0;
    }

    public void incrementaContador(View vista){
        contador ++;
        resultado();
    }

    public void resetContador(View vista){
        contador=0;
        resultado();
    }

    public void decrementaContador(View vista){
        contador --;
        resultado();
    }

    public void resultado(){
        TextView texto =(TextView) findViewById(R.id.texto);
        texto.setText("Contador: "+ contador);
    }
}