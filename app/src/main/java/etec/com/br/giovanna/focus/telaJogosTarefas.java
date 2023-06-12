package etec.com.br.giovanna.focus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class telaJogosTarefas extends AppCompatActivity {
ImageButton imBFrases, imBNumeros, imBMemoria, imBvelha;
Button btVoltarjt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogos_tarefas);
        imBvelha=findViewById(R.id.imBtVelha);
        imBFrases=findViewById(R.id.imBtFrases);
        imBMemoria=findViewById(R.id.imBtnmMemoria);
        imBNumeros=findViewById(R.id.imgBtNumeros);
        btVoltarjt=findViewById(R.id.btnVoltarJT);


        imBFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AbrirFrases = new Intent(telaJogosTarefas.this, tarefaFrases.class);
                startActivity(AbrirFrases);
            }
        });
        imBvelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AbrirJogodaVelha = new Intent(telaJogosTarefas.this, jogodaVelha.class);
                startActivity(AbrirJogodaVelha);
            }
        });
        btVoltarjt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imBNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirNumeros = new Intent (telaJogosTarefas.this, numeros.class);
                startActivity(abrirNumeros);
            }
        });

    }
}