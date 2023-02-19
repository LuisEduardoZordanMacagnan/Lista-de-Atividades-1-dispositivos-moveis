package com.ifsc.aplicativosorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView s;
    private EditText n1, n2;
    private Integer num;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = (TextView) findViewById(R.id.sorte);
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
    }

    public void sortear(View view){
        do {
            num = random.nextInt(Integer.valueOf(String.valueOf(n2.getText())))+1;
        }while(num<(Integer.valueOf(String.valueOf(n1.getText())))-1);
        s.setText(String.valueOf(num));
    }
}
