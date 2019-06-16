package ar.edu.unlam.tp1.taller.erikrodriguez.mercadolibreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView datoRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        datoRecibido = findViewById(R.id.resultado);
        String dato = getIntent().getStringExtra("datoBuscado");

        datoRecibido.setText(dato);
    }
}
