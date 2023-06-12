package etec.com.br.giovanna.focus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class jogodamemoria extends AppCompatActivity {
    String frutas[] = {"abacate", "abacaxi", "banana", "maca", "melancia", "morango", "pera", "uva",
            "abacate", "abacaxi", "banana", "maca", "melancia", "morango", "pera", "uva"};

    ImageView im00, im01, im02, im03, im04, im05, im06, im07, im08, im09, im10, im11, im12, im13, im14, im15;

    int clique=0,clique1=0,clique2=0,clique3=0,clique4=0,clique5=0,clique6=0,clique7=0,clique8=0,
            clique9=0,clique10=0,clique11=0,clique12=0,clique13=0,clique14=0,clique15=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogodamemoria);

        im00 = findViewById(R.id.img00);
        im01 = findViewById(R.id.img01);
        im02 = findViewById(R.id.img02);
        im03 = findViewById(R.id.img03);
        im04 = findViewById(R.id.img04);
        im05 = findViewById(R.id.img05);
        im06 = findViewById(R.id.img06);
        im07 = findViewById(R.id.img07);
        im08 = findViewById(R.id.img08);
        im09 = findViewById(R.id.img09);
        im10 = findViewById(R.id.img10);
        im11 = findViewById(R.id.img11);
        im12 = findViewById(R.id.img12);
        im13 = findViewById(R.id.img13);
        im14 = findViewById(R.id.img14);
        im15 = findViewById(R.id.img15);


        List<String> jogo = Arrays.asList(frutas);

        Collections.shuffle(jogo);

        jogo.toArray(frutas);

        //MOSTRAR NO LOG O EMBARALHAMENTO
        Log.e("JOGO ",Arrays.toString(frutas));

        for(int i=0;i< frutas.length;i++) {
            Log.e("ITEM  "+i ,Arrays.toString(new String[]{jogo.get(i)}));
        }

        im00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(0);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique==0){
                    switch (imagem){
                        case "abacate":
                            im00.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im00.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im00.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im00.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im00.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im00.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im00.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im00.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im00.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique=1;
                }else{
                    im00.setImageResource(R.drawable.cerebro);
                    clique=0;
                }
            }
        });

        im01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(1);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique1==0){
                    switch (imagem){
                        case "abacate":
                            im01.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im01.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im01.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im01.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im01.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im01.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im01.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im01.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im01.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique1=1;
                }else{
                    im01.setImageResource(R.drawable.cerebro);
                    clique1=0;
                }
            }
        });

        im02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(2);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique2==0){
                    switch (imagem){
                        case "abacate":
                            im02.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im02.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im02.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im02.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im02.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im02.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im02.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im02.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im02.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique2=1;
                }else{
                    im02.setImageResource(R.drawable.cerebro);
                    clique2=0;
                }
            }
        });


        im03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(3);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique3==0){
                    switch (imagem){
                        case "abacate":
                            im03.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im03.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im03.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im03.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im03.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im03.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im03.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im03.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im03.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique3=1;
                }else{
                    im03.setImageResource(R.drawable.cerebro);
                    clique3=0;
                }
            }
        });

        im04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(4);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique4==0){
                    switch (imagem){
                        case "abacate":
                            im04.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im04.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im04.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im04.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im04.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im04.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im04.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im04.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im04.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique4=1;
                }else{
                    im04.setImageResource(R.drawable.cerebro);
                    clique4=0;
                }
            }
        });

        im05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(5);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique5==0){
                    switch (imagem){
                        case "abacate":
                            im05.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im05.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im05.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im05.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im05.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im05.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im05.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im05.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im05.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique5=1;
                }else{
                    im05.setImageResource(R.drawable.cerebro);
                    clique5=0;
                }
            }
        });

        im06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(6);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique6==0){
                    switch (imagem){
                        case "abacate":
                            im06.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im06.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im06.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im06.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im06.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im06.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im06.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im06.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im06.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique6=1;
                }else{
                    im06.setImageResource(R.drawable.cerebro);
                    clique6=0;
                }
            }
        });

        im07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(7);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique7==0){
                    switch (imagem){
                        case "abacate":
                            im07.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im07.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im07.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im07.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im07.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im07.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im07.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im07.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im07.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique7=1;
                }else{
                    im07.setImageResource(R.drawable.cerebro);
                    clique7=0;
                }
            }
        });

        im08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(8);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique8==0){
                    switch (imagem){
                        case "abacate":
                            im08.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im08.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im08.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im08.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im08.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im08.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im08.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im08.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im08.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique8=1;
                }else{
                    im08.setImageResource(R.drawable.cerebro);
                    clique8=0;
                }
            }
        });

        im09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(9);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique9==0){
                    switch (imagem){
                        case "abacate":
                            im09.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im09.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im09.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im09.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im09.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im09.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im09.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im09.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im09.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique9=1;
                }else{
                    im09.setImageResource(R.drawable.cerebro);
                    clique9=0;
                }
            }
        });

        im10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(10);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique10==0){
                    switch (imagem){
                        case "abacate":
                            im10.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im10.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im10.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im10.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im10.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im10.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im10.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im10.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im10.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique10=1;
                }else{
                    im10.setImageResource(R.drawable.cerebro);
                    clique10=0;
                }
            }
        });

        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(11);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique11==0){
                    switch (imagem){
                        case "abacate":
                            im11.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im11.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im11.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im11.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im11.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im11.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im11.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im11.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im11.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique11=1;
                }else{
                    im11.setImageResource(R.drawable.cerebro);
                    clique11=0;
                }
            }
        });

        im12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(12);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique12==0){
                    switch (imagem){
                        case "abacate":
                            im12.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im12.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im12.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im12.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im12.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im12.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im12.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im12.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im12.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique12=1;
                }else{
                    im12.setImageResource(R.drawable.cerebro);
                    clique12=0;
                }
            }
        });

        im13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(13);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique13==0){
                    switch (imagem){
                        case "abacate":
                            im13.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im13.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im13.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im13.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im13.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im13.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im13.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im13.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im13.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique13=1;
                }else{
                    im13.setImageResource(R.drawable.cerebro);
                    clique13=0;
                }
            }
        });

        im14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(14);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique14==0){
                    switch (imagem){
                        case "abacate":
                            im14.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im14.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im14.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im14.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im14.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im14.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im14.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im14.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im14.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique14=1;
                }else{
                    im14.setImageResource(R.drawable.cerebro);
                    clique14=0;
                }
            }
        });

        im15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imagem;
                //PEGANDO A PRIMAIRA FRUTA
                imagem = jogo.get(15);

                //VENDO QUAL É PARA COLOCAR NO IMAGEVIEW
                if(clique15==0){
                    switch (imagem){
                        case "abacate":
                            im15.setImageResource(R.drawable.abacate1);
                            break;
                        case "abacaxi":
                            im15.setImageResource(R.drawable.abacaxi1);
                            break;
                        case "banana":
                            im15.setImageResource(R.drawable.banana1);
                            break;
                        case "maca":
                            im15.setImageResource(R.drawable.maca1);
                            break;
                        case "melancia":
                            im15.setImageResource(R.drawable.melancia1);
                            break;
                        case "morango":
                            im15.setImageResource(R.drawable.morango1);
                            break;
                        case "pera":
                            im15.setImageResource(R.drawable.pera1);
                            break;
                        case "uva":
                            im15.setImageResource(R.drawable.uva1);
                            break;
                        default:
                            im15.setImageResource(R.drawable.cerebro);
                            break;
                    }
                    clique15=1;
                }else{
                    im15.setImageResource(R.drawable.cerebro);
                    clique15=0;
                }
            }
        });






    }


}