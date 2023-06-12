package etec.com.br.giovanna.focus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class numeros extends AppCompatActivity {
    ImageView imCorreta, imCorreta2, imErrada, imErrada2, imErrada3, imErrada4;

    int clique=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        imCorreta = findViewById(R.id.imgCorreta);
        imCorreta2 = findViewById(R.id.imgCorreta2);
        imErrada = findViewById(R.id.imgErrada);
        imErrada2 = findViewById(R.id.imgErrada2);
        imErrada3 = findViewById(R.id.imgErrada3);
        imErrada4 = findViewById(R.id.imgErrada4);



        imCorreta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder acertou = new AlertDialog.Builder(numeros.this);
                acertou.setTitle("Ebaaa!");
                acertou.setMessage("Parabéns, você acertou!");
                acertou.setIcon(android.R.drawable.star_big_on);
                acertou.setPositiveButton("OK", null);
                acertou.create();
                acertou.show();

            }
        });

        imCorreta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder acertou = new AlertDialog.Builder(numeros.this);
                acertou.setTitle("Ebaaa!");
                acertou.setMessage("Parabéns, você acertou!");
                acertou.setIcon(android.R.drawable.star_big_on);
                acertou.setPositiveButton("OK", null);
                acertou.create();
                acertou.show();
            }
        });

        imErrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                androidx.appcompat.app.AlertDialog.Builder errou = new androidx.appcompat.app.AlertDialog.Builder(numeros.this);
                errou.setTitle("Ops!");
                errou.setMessage("Você errou! Tente novamente.");
                errou.setIcon(android.R.drawable.star_big_on);
                errou.setPositiveButton("OK", null);
                errou.create();
                errou.show();
            }
        });

        imErrada2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder errou = new AlertDialog.Builder(numeros.this);
                errou.setTitle("Ops!");
                errou.setMessage("Você errou! Tente novamente.");
                errou.setIcon(android.R.drawable.star_big_on);
                errou.setPositiveButton("OK", null);
                errou.create();
                errou.show();
            }
        });

        imErrada3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder errou = new AlertDialog.Builder(numeros.this);
                errou.setTitle("Ops!");
                errou.setMessage("Você errou! Tente novamente.");
                errou.setIcon(android.R.drawable.star_big_on);
                errou.setPositiveButton("OK", null);
                errou.create();
                errou.show();
            }
        });

        imErrada4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder errou = new AlertDialog.Builder(numeros.this);
                errou.setTitle("Ops!");
                errou.setMessage("Você errou! Tente novamente.");
                errou.setIcon(android.R.drawable.star_big_on);
                errou.setPositiveButton("OK", null);
                errou.create();
                errou.show();
            }
        });




    }
}