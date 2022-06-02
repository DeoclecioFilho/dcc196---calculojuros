package br.ufjf.dcc196.deocleciofilho.calculajuros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class JurosSimplesActivity extends AppCompatActivity {
     TextView textViewValorPresente;
     TextView textViewResultado;
     Double valorPresente;
     Double valorFinal;
     EditText editTextTaxaJuros;
    EditText editTextPeriodo;
     EditText textViewValorFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_simples);
        textViewValorPresente = findViewById(R.id.textViewValorPresente);
        editTextTaxaJuros = findViewById(R.id.editTextTaxaJuros);
        editTextPeriodo = findViewById(R.id.editTextPeriodo);
        textViewResultado = findViewById(R.id.textViewResultado);
        Bundle extras = getIntent().getExtras();
        valorPresente = extras.getDouble("valorPresente");
        valorFinal = extras.getDouble("valorFinal");
        textViewValorPresente.setText(textViewValorPresente.toString());
        textViewValorFinal.setText(textViewValorFinal.toString());
    }

    public void retornarClick(View view){
        Intent resultado = new Intent(JurosSimplesActivity.this,MainActivity.class);
        resultado.putExtra("valorFinal", valorFinal);
        finish();
    }
    public void calcularClick(View view){
        Double taxaDeJuros;
        Integer periodos;
        taxaDeJuros = Double.parseDouble(editTextTaxaJuros.getText().toString());
        periodos = Integer.parseInt(editTextPeriodo.getText().toString());
        Double valorFinal = valorPresente * (1+taxaDeJuros*periodos)/100.0;
        textViewResultado.setText(valorFinal.toString());
    }
}