package com.example.appdolarreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtValorDolar, idtQuantDolar;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorDolar = findViewById(R.id.edtValorDolar);
        idtQuantDolar = findViewById(R.id.idtQuantDolar);

        txtResultado = findViewById(R.id.idtQuantDolar);

    }

    public void calular(View view) {

        double quantDolar = Double.parseDouble(idtQuantDolar.getText().toString());
        double valorDolar = Double.parseDouble(edtValorDolar.getText().toString());

        double totalReais = valorDolar * quantDolar;

        txtResultado.setText("R$: " + totalReais);

    }
}