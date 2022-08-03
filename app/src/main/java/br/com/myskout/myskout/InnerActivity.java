package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InnerActivity extends AppCompatActivity {
    //declarar as variáveis e o que irão fazer
    EditText edtUsuario, edtSenha;
    Button btnEntrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //abrir o meu layout
        setContentView(R.layout.inner_layout);
        //Apresentar as variaveis do Java para o xml para que elas se conheçam
        edtUsuario = findViewById(R.id.edtUser);
        edtSenha = findViewById(R.id.edtPassword);
        btnEntrar = findViewById(R.id.btnEntrar);

        //criando a ação no botão entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validar a entrada do usuário
                String usuario, senha;

                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();

                if (edtUsuario.equals("Senac") && edtSenha.equals("Senac")) {
                    //abrindo outra janela
                    //Duas formas de abrir uma janela
                    startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                    finish();

                } else {
                    //enviando uma caixa com mensagem para o usuário
                }
                Toast.makeText(getApplicationContext(), "Usuário ou Senha Inválidos", Toast.LENGTH_SHORT).show();
                //chamando método limpar janela
                limparJanela();

            }
        });
    }

    public void limparJanela() {
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
    }


    //sair do sistema
    public void sairSistema(View view) {
        finish();
    }
}