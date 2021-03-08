package com.example.oscarapp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.oscarapp.Conexao;
import com.example.oscarapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText emailUser, senhaUser;
    private Button btnEntrar;
    private TextView txtResetSenha;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        startComponent();
        eventoClickbtn();
    }

    private void eventoClickbtn() {
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String email = emailUser.getText().toString().trim();
            String senha = senhaUser.getText().toString().trim();
                if (email.isEmpty() || senha.isEmpty()) {
                    alert("Favor inserir Email e Senha.");
                } else {
                    login(email, senha);
                }
            }
        });

    }

    private void login(String email, String senha) {
            auth.signInWithEmailAndPassword(email, senha)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Intent i = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(i);
                    } else {
                        alert("Email ou Senha incorreto!");
//                        startActivity(null);
                    }
                }
            });
    }

    private void alert(String s) {
        Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();
    }

    private void startComponent() {
        emailUser = (EditText) findViewById(R.id.emailUser);
        senhaUser = (EditText) findViewById(R.id.senhaUser);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
//       txtResetSenha = (Button) findViewById(R.id);
    }

    @Override
    protected void onStart() {
        super.onStart();
        auth = Conexao.getFirebaseAuth();
    }
}