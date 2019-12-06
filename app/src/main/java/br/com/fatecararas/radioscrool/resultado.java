package br.com.fatecararas.radioscrool;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    TextView titulo_texto;
    TextView mensagem;
    ImageView imagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        mensagem = findViewById(R.id.msg);
        titulo_texto = findViewById(R.id.titulo);
        imagem = findViewById(R.id.imagemFundo);

        Intent intent = getIntent();
        int total = intent.getIntExtra("pontuacao", 0);




        if (total <= 10){
            imagem.setImageResource(R.drawable.caloria);
            titulo_texto.setText("Só nas Calorias");
            mensagem.setText("Ninguém vive só de pizza e brigadeiro né? Claro que tudo isso é uma delícia, mas nosso corpo precisa de um pouco de tudo: carboidratos, proteínas, fibras... Consultar um nutricionista pose ser uma ótima maneira de começar.");
        }else if(total >= 11 && total <= 20){
            imagem.setImageResource(R.drawable.malhar);
            titulo_texto.setText("#partiumalhar");
            mensagem.setText("Cuidar da alimentação é o primeiro passo para uma vida saudável. Lembre: Você é aquilo que você come. Fazer algum exercício físico também ajuda a manter o peso em equilíbrio. Pode ser jazz, natação, vôlei... Bora se mexer?");
        }else if(total >= 21 && total <= 28){
            imagem.setImageResource(R.drawable.balanca);
            titulo_texto.setText("Viva a genética");
            mensagem.setText("Às vezes, rolam algumas encanações com o corpo, certo? Mas, mesmo assim, você sabe que é bonita do seu jeito e não precisa fazer muita coisa para continuar de bem com a balança. Só fique esperta para também manter a saúde em dia!");
        }else if(total >= 29 && total <= 40){
            imagem.setImageResource(R.drawable.fitness);
            titulo_texto.setText("Garota Fitness");
            mensagem.setText("Comer frutas nos intervalos das refeições, se exercitar três vezes por semana e não jantar coisa muito pesadas: é assim que você leva a vida. Parabéns pelo foco! Só que não precisa virar a doida da dieta, combinado? Tudo em exagero acaba sendo prejudicial a saúde.");
        }


    }


}
