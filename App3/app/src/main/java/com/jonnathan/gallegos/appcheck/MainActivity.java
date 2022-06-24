package com.jonnathan.gallegos.appcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etnum1, etnum2;
    private CheckBox cbsuma, cbresta;
    private Button btncalcula;
    private TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignacion_variables();
        Eventos_Botones();
    }

    private void asignacion_variables(){
        etnum1 = (EditText) findViewById(R.id.etnum1);
        etnum2 = (EditText) findViewById(R.id.etnum2);
        tvresultado = (TextView) findViewById(R.id.tvresultado);
        btncalcula = (Button) findViewById(R.id.btncalcula);
        cbsuma = (CheckBox) findViewById(R.id.cbsum);
        cbresta = (CheckBox) findViewById(R.id.cbres);
    }

    private void Eventos_Botones(){
        btncalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
            }
        });
    }

    private void calcular(){
        int num1 = Integer.parseInt(etnum1.getText().toString());
        int num2 = Integer.parseInt(etnum2.getText().toString());
        String resul= null;
        if(cbsuma.isChecked() == true){
            int resultado = num1 + num2;
            resul = "La suma es: "+resultado;
            Toast.makeText(this, "Esta bien la suma.", Toast.LENGTH_SHORT).show();
        }
        if(cbresta.isChecked() == true){
            int resultado = num1 - num2;
            resul = resul +" / La resta"+resultado;
        }
        tvresultado.setText(resul);
    }
    private void now(){
        int num1 = Integer.parseInt(etnum1.getText().toString());
        int num2 = Integer.parseInt(etnum2.getText().toString());
        String resul= null;
        if(cbsuma.isChecked() == true){
            int resultado = num1 + num2;
            resul = "La suma es: "+resultado;
            Toast.makeText(this, "Esta bien la suma.", Toast.LENGTH_SHORT).show();
        }
        if(cbresta.isChecked() == true){
            int resultado = num1 - num2;
            resul = resul +" / La resta"+resultado;
        }
        tvresultado.setText(resul);
    }
}