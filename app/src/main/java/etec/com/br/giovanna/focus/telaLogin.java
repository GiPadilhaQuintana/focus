package etec.com.br.giovanna.focus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import etec.com.br.giovanna.focus.modelo.Responsavel;

public class telaLogin extends AppCompatActivity {

    EditText edEmailLogin, edSenhaLogin;
    Button btLogin, btCadastrarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        btLogin= findViewById(R.id.btnLogin);
        btCadastrarLogin= findViewById(R.id.btnCadastrarLogin);
        edEmailLogin = findViewById(R.id.edtEmailLogin);
        edSenhaLogin = findViewById(R.id.edtSenhaLogin);





        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent AbrirTelaPrincipal = new Intent(telaLogin.this, Telaprincipal.class);
                startActivity(AbrirTelaPrincipal);
            }

        });
        btCadastrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AbrirCadastro = new Intent(telaLogin.this, MainActivity.class);
                startActivity(AbrirCadastro);
            }
        });
    }
}