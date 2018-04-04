package com.example.phillipeosorio.projetograduacao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by phillipeosorio on 02/11/2017.
 */

public class DBHelperProduto extends SQLiteOpenHelper {

    private static int versao = 1;
    private static String nome = "produtos.db";

    public DBHelperProduto(Context context) {
        super(context, nome,null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String str = "CREATE TABLE Produtos (produto TEXT PRIMARY KEY," + "preco TEXT," + "quantidade TEXT)";
        db.execSQL(str);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL(" DROP TABLE IF EXISTS Produtos");
        onCreate(db);

    }

    public long CriarProduto(String produto,float preco, int quantidade){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("produto", produto);
        cv.put("preco", preco);
        cv.put("quantidade", quantidade);
        long result = db.insert("Produtos", null, cv);
        return result;
    }

    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + nome;
        Cursor data= db.rawQuery(query, null);
        return data;
    }



}
