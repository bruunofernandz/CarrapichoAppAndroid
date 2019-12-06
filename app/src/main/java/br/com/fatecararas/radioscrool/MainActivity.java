package br.com.fatecararas.radioscrool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView resultado_final;

    final int[] resposta = new int[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //resultado_final = findViewById(R.id.resultado);



        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonA:
                        toast("Alternativa A!");
                        resposta[0] = 4;
                        break;
                    case R.id.radioButtonB:
                        toast("Alternativa B!");
                        resposta[0] = 2;
                        break;
                    case R.id.radioButtonC:
                        toast("Alternativa C!");
                        resposta[0] = 3;
                        break;
                    case R.id.radioButtonD:
                        toast("Alternativa D!");
                        resposta[0] = 1;
                        break;

                }
            }
        });

        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton2A:
                        toast("Alternativa A!");
                        resposta[1] = 1;
                        break;
                    case R.id.radioButton2B:
                        toast("Alternativa B!");
                        resposta[1] = 2;
                        break;
                    case R.id.radioButton2C:
                        toast("Alternativa C!");
                        resposta[1] = 4;
                        break;
                    case R.id.radioButton2D:
                        toast("Alternativa D!");
                        resposta[1] = 3;
                        break;

                }
            }
        });

        RadioGroup radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton3A:
                        toast("Alternativa A!");
                        resposta[2] = 2;
                        break;
                    case R.id.radioButton3B:
                        toast("Alternativa B!");
                        resposta[2] = 1;
                        break;
                    case R.id.radioButton3C:
                        toast("Alternativa C!");
                        resposta[2] = 3;
                        break;
                    case R.id.radioButton4D:
                        toast("Alternativa D!");
                        resposta[2] = 4;
                        break;

                }
            }
        });

        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton4A:
                        toast("Alternativa A!");
                        resposta[3] = 3;
                        break;
                    case R.id.radioButton4B:
                        toast("Alternativa B!");
                        resposta[3] = 4;
                        break;
                    case R.id.radioButton4C:
                        toast("Alternativa C!");
                        resposta[3] = 1;
                        break;
                    case R.id.radioButton4D:
                        toast("Alternativa D!");
                        resposta[3] = 2;
                        break;

                }
            }
        });

        RadioGroup radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton5A:
                        toast("Alternativa A!");
                        resposta[4] = 1;
                        break;
                    case R.id.radioButton5B:
                        toast("Alternativa B!");
                        resposta[4] = 3;
                        break;
                    case R.id.radioButton5C:
                        toast("Alternativa C!");
                        resposta[4] = 2;
                        break;
                    case R.id.radioButton5D:
                        toast("Alternativa D!");
                        resposta[4] = 3;
                        break;

                }
            }
        });

        RadioGroup radioGroup6 = findViewById(R.id.radioGroup6);
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton6A:
                        toast("Alternativa A!");
                        resposta[5] = 3;
                        break;
                    case R.id.radioButton6B:
                        toast("Alternativa B!");
                        resposta[5] = 1;
                        break;
                    case R.id.radioButton6C:
                        toast("Alternativa C!");
                        resposta[5] = 2;
                        break;
                    case R.id.radioButton6D:
                        toast("Alternativa D!");
                        resposta[5] = 4;
                        break;

                }
            }
        });

        RadioGroup radioGroup7 = findViewById(R.id.radioGroup7);
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton7A:
                        toast("Alternativa A!");
                        resposta[6] = 4;
                        break;
                    case R.id.radioButton7B:
                        toast("Alternativa B!");
                        resposta[6] = 3;
                        break;
                    case R.id.radioButton7C:
                        toast("Alternativa C!");
                        resposta[6] = 1;
                        break;
                    case R.id.radioButton7D:
                        toast("Alternativa D!");
                        resposta[6] = 2;
                        break;

                }
            }
        });

        RadioGroup radioGroup8 = findViewById(R.id.radioGroup8);
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton8A:
                        toast("Alternativa A!");
                        resposta[7] = 3;
                        break;
                    case R.id.radioButton8B:
                        toast("Alternativa B!");
                        resposta[7] = 2;
                        break;
                    case R.id.radioButton8C:
                        toast("Alternativa C!");
                        resposta[7] = 1;
                        break;
                    case R.id.radioButton8D:
                        toast("Alternativa D!");
                        resposta[7] = 4;
                        break;

                }
            }
        });

        RadioGroup radioGroup9 = findViewById(R.id.radioGroup9);
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton9A:
                        toast("Alternativa A!");
                        resposta[8] = 2;
                        break;
                    case R.id.radioButton9B:
                        toast("Alternativa B!");
                        resposta[8] = 3;
                        break;
                    case R.id.radioButton9C:
                        toast("Alternativa C!");
                        resposta[8] = 1;
                        break;
                    case R.id.radioButton9D:
                        toast("Alternativa D!");
                        resposta[8] = 4;
                        break;

                }
            }
        });

        RadioGroup radioGroup10 = findViewById(R.id.radioGroup10);
        radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton10A:
                        toast("Alternativa A!");
                        resposta[9] = 1;
                        break;
                    case R.id.radioButton10B:
                        toast("Alternativa B!");
                        resposta[9] = 4;
                        break;
                    case R.id.radioButton10C:
                        toast("Alternativa C!");
                        resposta[9] = 3;
                        break;
                    case R.id.radioButton10D:
                        toast("Alternativa D!");
                        resposta[9] = 2;
                        break;

                }
            }
        });

    }

    public void toast(String mensagem) {
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

    public void calcular(View view) {

//        resultado_final.setText(String.valueOf(total));
        int total = (resposta[0] + resposta[1] + resposta[2] + resposta[3] + resposta[4] + resposta[5] + resposta[6] + resposta[7] + resposta[8] + resposta[9]);
        Intent intent = new Intent(getApplicationContext(), resultado.class);
        intent.putExtra("pontuacao", total);
        startActivity(intent);
    }
}
