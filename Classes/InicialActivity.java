package com.example.phillipeosorio.projetograduacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicialActivity extends AppCompatActivity {


    Button bt_vendas, bt_estoque, bt_maquinas, bt_terreno, bt_financeiro, bt_compras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        bt_vendas = (Button) findViewById(R.id.bt_ivendas);
        bt_estoque = (Button) findViewById(R.id.bt_iestoque);
        bt_maquinas = (Button) findViewById(R.id.bt_imaquinas);
        bt_terreno = (Button) findViewById(R.id.bt_iterreno);
        bt_financeiro = (Button) findViewById(R.id.bt_ifinanceiro);
        bt_compras = (Button) findViewById(R.id.bt_icompras);


        bt_vendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InicialActivity.this, VendasActivity.class);
                startActivity(i);
            }
        });

        bt_estoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InicialActivity.this, EstoqueActivity.class);
                startActivity(i);
            }
        });

        bt_maquinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InicialActivity.this, MaquinasActivity.class);
                startActivity(i);
            }
        });

        bt_terreno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InicialActivity.this, TerrenoActivity.class);
                startActivity(i);
            }
        });

        bt_financeiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InicialActivity.this, FinanceiroActivity.class);
                startActivity(i);
            }
        });

        bt_compras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InicialActivity.this, ComprasActivity.class);
                startActivity(i);
            }
        });

    }

}