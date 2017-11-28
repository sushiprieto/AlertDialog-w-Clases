package com.trabajo.carlos.a013_boletin2ej3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText edtTitulo, edtMensaje;
    private Button btnCrear;
    String titulo, mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMensaje = findViewById(R.id.edtMensaje);
        edtTitulo = findViewById(R.id.edtTitulo);
        btnCrear = findViewById(R.id.btnCrear);


        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = edtTitulo.getText().toString();
                mensaje = edtMensaje.getText().toString();

                Util.dialogo(MainActivity.this, titulo, mensaje);



            }
        });

    }


}
