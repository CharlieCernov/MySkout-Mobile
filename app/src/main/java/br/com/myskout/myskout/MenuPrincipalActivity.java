package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    //Declarando variaveis globais dos componentes:

    CardView cardPerfil, cardVagas, cardTalents, cardPartnership, cardCandidato, cardRecruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        //Apresentando as variaveis xml para o java
        cardPerfil = findViewById(R.id.cardPerfil);
        cardCandidato = findViewById(R.id.cardCandidato);
        cardPartnership = findViewById(R.id.cardPartnership);
        cardVagas = findViewById(R.id.cardVagas);
        cardRecruit = findViewById(R.id.cardRecruit);
        cardTalents = findViewById(R.id.cardTalents);

        //Os componentes recebendo o evento de click
        cardPerfil.setOnClickListener(this);
        cardCandidato.setOnClickListener(this);
        cardPartnership.setOnClickListener(this);
        cardRecruit.setOnClickListener(this);
        cardTalents.setOnClickListener(this);
        cardVagas.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cardPerfil:
                startActivity(new Intent(
                      getApplicationContext(),
                      PerfilActivity.class
                ));
                finish();
                break;

            case R.id.cardCandidato:
                startActivity(new Intent(
                        getApplicationContext(),
                        CandidatosActivity.class
                ));
                finish();
                break;

            case R.id.cardVagas:
                startActivity(new Intent(
                        getApplicationContext(),
                        VagasActivity.class
                ));
                finish();
                break;

            case R.id.cardPartnership:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceriasActivity.class
                ));
                finish();
                break;

            case R.id.cardRecruit:
                startActivity(new Intent(
                        getApplicationContext(),
                        RecrutadoresActivity.class
                ));
                finish();
                break;

            case R.id.cardTalents:
                startActivity(new Intent(
                        getApplicationContext(),
                        TalentosActivity.class
                ));
                finish();
                break;
        }
    }
}