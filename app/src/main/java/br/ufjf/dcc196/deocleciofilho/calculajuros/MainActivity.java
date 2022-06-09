package br.ufjf.dcc196.deocleciofilho.calculajuros;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ActivityResultLauncher<Intent> launcher;
    EditText EditTextValorPresente;
    TextView textViewValorFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditTextValorPresente = findViewById(R.id.editTextValorPresente);
        launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        Double valorFinal;
                        Bundle extra;

                    }
                }
        );
    }

    public void JurosSimplesClick(View view){
        Double valorPresente = Double.parseDouble(EditTextValorPresente.getText().toString());

        Intent intent = new Intent(MainActivity.this,JurosSimplesActivity.class);
        intent.putExtra("valorPresente",valorPresente);
        startActivity(intent);
    }
    public void JurosCompostoClick(View view){
        Double valorPresente = Double.parseDouble(EditTextValorPresente.getText().toString());

        Intent intent = new Intent(MainActivity.this,JurosSimplesActivity.class);
        intent.putExtra("valorPresente",valorPresente);
        startActivity(intent);
    }
}