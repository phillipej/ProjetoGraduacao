package com.example.phillipeosorio.projetograduacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MaquinasActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maquinas);


        ListView lista2 = (ListView) findViewById(R.id.listViewMaquinas);
        ArrayList<String> maquinas = preencherDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, maquinas);
        lista2.setAdapter(arrayAdapter);
    }




//    private ArrayList<String> preencherDados(){
//        ArrayList<String> dados = new ArrayList<String>();
//        dados.add("Trator                                         Disponível");
//        dados.add("Caminhonete                            Ocupada");
//        return dados;


 //   }
}
