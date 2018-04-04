package com.example.phillipeosorio.projetograduacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class CadastrarProdutoActivity extends AppCompatActivity {

    EditText et_descricao, et_preco, et_quantidade;
    Button bt_adicionar;

    DBHelperProduto db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_produto);


        db = new DBHelperProduto(this);

        et_descricao = (EditText) findViewById(R.id.et_descricaoProduto);
        et_preco = (EditText) findViewById(R.id.et_precoProduto);
        et_quantidade = (EditText) findViewById(R.id.et_quantidadeProduto);

        bt_adicionar = (Button) findViewById(R.id.bt_adicionarProduto);

        bt_adicionar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String descricao = et_descricao.getText().toString();
                float preco = Float.valueOf(et_preco.getText().toString());
                int quantidade = Integer.parseInt(String.valueOf(et_quantidade.getText()));


                    long res = db.CriarProduto(descricao, preco, quantidade);
                    Toast.makeText(CadastrarProdutoActivity.this,
                            "Produto Cadastrado", LENGTH_SHORT).show();
                }

        });

    }
}
