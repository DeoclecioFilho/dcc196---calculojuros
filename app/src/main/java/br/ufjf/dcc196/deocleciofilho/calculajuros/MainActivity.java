package br.ufjf.dcc196.deocleciofilho.calculajuros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextValorPrsente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextValorPrsente = findViewById(R.id.editTextValorPrensente);
    }

    public void JurosSimplesClick(View view){
        Double valorPresente = Double.parseDouble(editTextValorPrsente.getText().toString());

        Intent intent = new Intent(MainActivity.this,JurosSimplesActivity.class);
        intent.putExtra("valorPresente",valorPresente);
        startActivity(intent);
    }
}