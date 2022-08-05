package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

public class CandidatosActivity extends AppCompatActivity {
    //declarando variavel para apresentar para o Java
    BottomAppBar bottomAppBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidatos_layout);

        //Apresentando o xml ao Java
        bottomAppBar = findViewById(R.id.bottomBarCandidatos);

        //clicando nos itens de menu
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mBottomAlterar:
                        Toast.makeText(getApplicationContext(),
                                "cliquei no botão alterar",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.mBottomExcluir:
                        Toast.makeText(getApplicationContext(),
                                "cliquei no botão excluir",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.mBottomPesquisar:
                        Toast.makeText(getApplicationContext(),
                                "cliquei no botão pesquisar",
                                Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });

        //Clicando no ícone de navegação do bottomnar
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no ícone bottomBat",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}