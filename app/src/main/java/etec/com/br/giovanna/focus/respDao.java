package etec.com.br.giovanna.focus;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import etec.com.br.giovanna.focus.modelo.conexao;

public class respDao {
    private conexao con;
    private SQLiteOpenHelper bd;

    public respDao(Context context){
        con = new conexao(context);
        bd = new getWritableDatabase();
    }

    private class getWritableDatabase extends SQLiteOpenHelper {
    }
}
