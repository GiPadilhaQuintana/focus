package etec.com.br.giovanna.focus.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class conexao extends SQLiteOpenHelper {

    private static final String nome = "bdFocus.db";
    private static final int versao = 1;

    public conexao(@Nullable Context context) {
        super(context, nome, null, versao);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE responsavel (id integer primary key autoincrement,nome varchar(80), dataNasc date, email string, senha string)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
