package com.example.login;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etContra;
    private Button btEntrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVista();
    }

    private void inicializarVista(){

        etEmail = findViewById(R.id.etEmail);
        etContra = findViewById(R.id.etContra);
        btEntrar = findViewById(R.id.btEntrar);

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String contra = etContra.getText().toString();

                if(email.isEmpty() || contra.isEmpty()){

                    Toast.makeText(MainActivity.this,"Usuario o contraseña vacia",Toast.LENGTH_LONG).show();

                }
                    else if(email.equals("pepe@mail.com") && contra.equals("12345678")){
                        Intent i = new Intent(MainActivity.this, BienvenidoActivity.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(MainActivity.this,"Usuario o contraseña Incorrecta",Toast.LENGTH_LONG).show();
                    }

                }
        });
    }
}