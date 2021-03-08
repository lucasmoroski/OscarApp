package com.example.oscarapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.oscarapp.R;

public class ConfirmarActivity extends AppCompatActivity {

    TextView Diretor, Filme;

    public String nomediretor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        Diretor = (TextView) findViewById(R.id.txtDiretor);
        Filme = (TextView) findViewById(R.id.txtFilme);

        Intent intentR = getIntent();
        Bundle paramR = intentR.getExtras();

        if(paramR != null){
            String nomeDi = paramR.getString("nome");
            int idDi = paramR.getInt("id");
                nomediretor = nomeDi;
                Diretor.setText(nomeDi);
        }
    }





}