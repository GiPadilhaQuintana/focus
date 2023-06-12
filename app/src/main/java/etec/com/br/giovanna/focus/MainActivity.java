package etec.com.br.giovanna.focus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import etec.com.br.giovanna.focus.modelo.Responsavel;

public class MainActivity extends AppCompatActivity {
Button btJaCadas, btProximo, btvariavel;
EditText edNome, edDataNasc, edEmail, edSenha;
   String nome,senha, email, datanasc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btJaCadas = findViewById(R.id.btnjaCadas);
        btProximo = findViewById(R.id.btnProx);
        edNome = findViewById(R.id.edtNome);
        edDataNasc = findViewById(R.id.edtDataNasc);
        edEmail = findViewById(R.id.edtEmail);
        edSenha = findViewById(R.id.edtSenha);



        btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nome = edNome.getText().toString();
                senha = edSenha.getText().toString();
                email = edEmail.getText().toString();
                datanasc = edDataNasc.getText().toString();

                if (nome.isEmpty() && senha.isEmpty() && email.isEmpty() && datanasc.isEmpty()) {
                    edSenha.setError("Digite a senha");
                    edNome.setError("Digite o nome");
                    edEmail.setError("Digite seu email");
                    edDataNasc.setError("Digite uma data de nascimento");
                } else {
                    Intent AbrirCadasUsuario = new Intent(MainActivity.this, CadastroUsuario.class);
                    startActivity(AbrirCadasUsuario);
                }
            }
        });


        btJaCadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AbrirLogin = new Intent(MainActivity.this, telaLogin.class);
                startActivity(AbrirLogin);
            }
        });


    }

}

