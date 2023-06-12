package etec.com.br.giovanna.focus;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tarefaFrases extends AppCompatActivity {
Button btLimpar, btVoltar, btConferir;
EditText edAviao, edBanana, edCama, edDado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa_frases);

        btConferir=findViewById(R.id.btnConferir);
        btLimpar=findViewById(R.id.btnLimpar);
        btVoltar=findViewById(R.id.btnVoltarTF);
        edAviao=findViewById(R.id.edtAviao);
        edBanana=findViewById(R.id.edtBanana);
        edCama=findViewById(R.id.edtCama);
        edDado=findViewById(R.id.edtDado);

        btConferir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aviao, banana, cama, dado;

                aviao = edAviao.getText().toString();
                banana = edBanana.getText().toString();
                cama = edCama.getText().toString();
                dado = edDado.getText().toString();


                if (aviao.contains("aviao") && banana.contains("banana") && cama.contains("cama")
                        && dado.contains("dado")) {
                    AlertDialog.Builder acertou = new AlertDialog.Builder(tarefaFrases.this);
                    acertou.setTitle("Parabéns!");
                    acertou.setMessage("Parabéns! Você acertou todas as questões." );
                    acertou.setIcon(android.R.drawable.star_big_on);
                    acertou.setPositiveButton("OK", null);
                    acertou.create();
                    acertou.show();
                } else {
                    AlertDialog.Builder errou = new AlertDialog.Builder(tarefaFrases.this);
                    errou.setTitle("Ops!");
                    errou.setMessage("Ops! Parece que algo está errado...");
                    errou.setIcon(android.R.drawable.star_big_on);
                    errou.setPositiveButton("OK", null);
                    errou.create();
                    errou.show();
                }
            }
        });

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edAviao.setText("");
                edDado.setText("");
                edBanana.setText("");
                edCama.setText("");

            }
        });




    }
}