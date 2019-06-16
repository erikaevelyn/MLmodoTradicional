package ar.edu.unlam.tp1.taller.erikrodriguez.mercadolibreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText elementoBuscado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elementoBuscado = findViewById(R.id.IngresarBusqueda);
        //se comunica la parte logica con la grafica (se guarda en esta varibale)

        Button  btnEnviar= (Button) findViewById(R.id.miBoton);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // código a ejecutar cuando sea pulsado

                Intent i = new Intent(MainActivity.this, ResultadoActivity.class);
                //creo un Intent pasando por parametro la clase actual (this) uy la clase a la que quiero ir

                i.putExtra("datoBuscado", elementoBuscado.getText().toString());
                //Al intent con el metodo putExtra para enviar datos
                //Por parametro le paso un nombre con el que lo voy a identificar en el otro Activity --> "datoBuscado"
                // Y le paso el dato que quiero enviar convertido a String --> elementoBuscado.getText().toString()

                startActivity(i);
                //Le damos inicio a la nueva activity, pasando por parametro el intent.

            }
        });
    }


}