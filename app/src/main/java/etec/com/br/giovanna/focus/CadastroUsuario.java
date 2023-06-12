package etec.com.br.giovanna.focus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class CadastroUsuario extends AppCompatActivity {
Button btCadastrarUsuario;
Switch sAutismo, sTdah, sOutros;
EditText edNomeUsu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
        btCadastrarUsuario = findViewById(R.id.btnCadastrar);
        sAutismo = findViewById(R.id.stAutista);
        sTdah = findViewById(R.id.stTdah);
        sOutros = findViewById(R.id.stOutros);
        edNomeUsu = findViewById(R.id.edtNomeUsuario);

     btCadastrarUsuario.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String nome;
             nome = edNomeUsu.getText().toString();
             if(nome.isEmpty()){
                 edNomeUsu.setError("Informe o nome do Usuário");
             }else{
                 Intent AbrirLoginF = new Intent(CadastroUsuario.this, telaLogin.class);
                 startActivity(AbrirLoginF);
             }
         }
     });
    }

}