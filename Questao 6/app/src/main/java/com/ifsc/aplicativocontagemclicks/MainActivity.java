package com.ifsc.aplicativocontagemclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int cliques = 0;
    private TextView contador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = (TextView)findViewById(R.id.TextViewContador);
    }
    public void contaClicks(View view){
        cliques++;
        contador.setText("Cliques: "+cliques);
    }
}