package br.com.samuelpatricio.atividadeavaliativa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnSaudacao;
    TextView tvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // super classe
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.editNome); // o que for digitado no aplicativo vai ser atribuido no edtNome, variável recebe.
        btnSaudacao = findViewById(R.id.btnBotao); // mesma coisa aqui e abaixo
        tvMensagem = findViewById(R.id.tvNome);

        btnSaudacao.setOnClickListener(new View.OnClickListener() { // ao clicar um evento acontece, que é o setOnclick...
            @Override
            public void onClick(View v) {
                // PEGAR A INFORMAÇÃO DO EDITTEXT
                String mensagem = "Olá, " + edtNome.getText().toString(); // pega texto e converte pra string
                tvMensagem.setText(mensagem);
            }
        });



    }
}