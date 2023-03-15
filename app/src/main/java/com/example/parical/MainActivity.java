package com.example.parical;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnContextClickListener {
    EditText tex1, tex2;
    TextView tv1;
    Button btn1, btn2, btn3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tex1 = (EditText)findViewById(R.id.texto1);
        tex2 = (EditText)findViewById(R.id.texto2);
        tv1 = (TextView)findViewById(R.id.vista);

        btn1 = (Button) findViewById(R.id.boton1);
        btn1.setOnClickListener((View.OnClickListener) this);

        btn2 = (Button) findViewById(R.id.boton2);
        btn2.setOnClickListener((View.OnClickListener) this);

        btn3 = (Button)  findViewById(R.id.boton3);
        btn3.setOnClickListener((View.OnClickListener) this);


    }



    @Override
    public boolean onContextClick(View view) {

        return false;
    }
public static void main(String[] args){
        potencia ejercicio = new potencia();
        multiplicar multi = new multiplicar();
}
}

