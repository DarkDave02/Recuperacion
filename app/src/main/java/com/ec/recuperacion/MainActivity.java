package com.ec.recuperacion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtLado;
    private Button btnGenerar;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtLado = findViewById(R.id.edtLado);
        btnGenerar = findViewById(R.id.btnGenerar);
        textResultado = findViewById(R.id.textResultado);

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularArea();
            }
        });
    }

    private void calcularArea() {
        String ladoStr = edtLado.getText().toString();

        if (!ladoStr.isEmpty()) {
            double lado = Double.parseDouble(ladoStr);

            double area = lado * lado;

            textResultado.setText("El área de su cuadrado es: " + area);
        } else {
            textResultado.setText("ERROR!!!, Ingrese un valor para calcular el área");
        }
    }
}

