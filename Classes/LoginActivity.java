package com.example.phillipeosorio.projetograduacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText et_usuario, et_senha;
    Button bt_entrar;

    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DBHelper(this);

        et_senha = (EditText) findViewById(R.id.et_senha);
        et_usuario = (EditText) findViewById(R.id.et_usuario);

        bt_entrar = (Button) findViewById(R.id.bt_entrar);

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = et_usuario.getText().toString();
                String senha = et_senha.getText().toString();

                if (usuario.equals("")) {
                    Toast.makeText(LoginActivity.this, "Usuário não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                } else if (senha.equals("")) {
                    Toast.makeText(LoginActivity.this, "Senha não inserida, tente novamente", Toast.LENGTH_SHORT).show();
                } else {
                    //tudo certo
                    String res = db.ValidarLogin(usuario, senha);

                    if (res.equals("OK")) {
                        //Toast.makeText(LoginActivity.this, "Login OK", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(LoginActivity.this, InicialActivity.class);
                        startActivity(i);

                    } else {
                        Toast.makeText(LoginActivity.this, "Login errado", Toast.LENGTH_SHORT).show();

                    }
                }
            }

        });
    }
}
