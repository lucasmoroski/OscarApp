package com.example.oscarapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.oscarapp.R;

public class ValidavotoActivity extends AppCompatActivity {

    TextView Filme,Diretor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validavoto);
    }
}