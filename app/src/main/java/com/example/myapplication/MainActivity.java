package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText Valor1, Valor2;
    private TextView resultado, textViewOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.layout4);
        Valor1 = (EditText) findViewById(R.id.editTextNumber);
        Valor2 = (EditText) findViewById(R.id.editTextNumber2);
        resultado = (TextView) findViewById(R.id.editTextNumber3);
        textViewOperacion = (TextView) findViewById(R.id.textViewOperacion);
    }

    public void setSimbolo(View view, String simbolo) {
        textViewOperacion.setText(simbolo);
    }
    public void operacionesSuma(View view) {
        int valor1 = Integer.parseInt(Valor1.getText().toString());
        int valor2 = Integer.parseInt(Valor2.getText().toString());
        int operacion = valor1 + valor2;
        String result = String.valueOf(operacion);
        setSimbolo(view, "+");
        resultado.setText(result);
    }
    public void operacionesResta(View view) {
        int valor1 = Integer.parseInt(Valor1.getText().toString());
        int valor2 = Integer.parseInt(Valor2.getText().toString());
        int operacion = valor1 - valor2;
        String result = String.valueOf(operacion);
        setSimbolo(view, "-");
        resultado.setText(result);
    }

    public void operacionesProducto(View view) {
        int valor1 = Integer.parseInt(Valor1.getText().toString());
        int valor2 = Integer.parseInt(Valor2.getText().toString());
        int operacion = valor1 * valor2;
        String result = String.valueOf(operacion);
        setSimbolo(view, "*");
        resultado.setText(result);
    }
    public void operacionesDivision(View view) {
        int valor1 = Integer.parseInt(Valor1.getText().toString());
        int valor2 = Integer.parseInt(Valor2.getText().toString());
        if(valor2 != 0) {
            int operacion = valor1 / valor2;
            String result = String.valueOf(operacion);
            setSimbolo(view, "/");
            resultado.setText(result);
        }else{
            Toast.makeText(this, "No se puede dividir por 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void operacionesModulo(View view) {
        int valor1 = Integer.parseInt(Valor1.getText().toString());
        int valor2 = Integer.parseInt(Valor2.getText().toString());
        int operacion = valor1 % valor2;
        String result = String.valueOf(operacion);
        setSimbolo(view, "%");
        resultado.setText(result);
    }




}