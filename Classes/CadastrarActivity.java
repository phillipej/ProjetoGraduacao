package com.example.phillipeosorio.projetograduacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class CadastrarActivity extends AppCompatActivity {

    EditText et_usuario, et_senha1, et_senha2;
    Button bt_registrar;

    DBHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        db = new DBHelper(this);

        et_usuario = (EditText) findViewById(R.id.et_reg_usuario);
        et_senha1 = (EditText) findViewById(R.id.et_reg_senha1);
        et_senha2 = (EditText) findViewById(R.id.et_reg_senha2);


        bt_registrar = (Button) findViewById(R.id.bt_registrarnovo);

        bt_registrar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String usuario = et_usuario.getText().toString();
                String s1 = et_senha1.getText().toString();
                String s2 = et_senha2.getText().toString();


                if (usuario.equals("")){
                    Toast.makeText(CadastrarActivity.this,
                            "Usuário não inserido, tente novamente", LENGTH_SHORT).show();

                }
                else if (s1.equals("") || s2.equals("")){
                    Toast.makeText(CadastrarActivity.this,
                            "Preencher a senha, tente novamente", LENGTH_SHORT).show();

                }
                else if(!s1.equals(s2)){
                    Toast.makeText(CadastrarActivity.this,
                            "As duas senhas não conferem, tente novamente", LENGTH_SHORT).show();

                }
                else{
                    //tudo certo
                    long res = db.CriarUtilizador(usuario, s1);
                    if(res>0){
                        Toast.makeText(CadastrarActivity.this,
                                "Registro efetuado", LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(CadastrarActivity.this,
                                "Registro inválido, tente novamente", LENGTH_SHORT).show();
                    }
                        

                }
            }
        });
    }
}
