package com.example.monbassa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LeconActivity extends AppCompatActivity {

    private static TextView mMotLecon;
    private static TextView mMotTraduit;
    private static TextView mTitre;
    private String mLeconChoisi;
    private Button mBtnRetour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecon);


        mMotLecon = findViewById(R.id.lecon_activity_txt_mot_a_apprendre);
        mMotTraduit = findViewById(R.id.lecon_activity_txt_mot_a_traduire);
        mTitre =findViewById(R.id.lecon_activity_txt_title);
        mBtnRetour = findViewById(R.id.lecon_activity_btn_retour);
        mBtnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LeconActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        mLeconChoisi = intent.getStringExtra("choiceBtn");
        getMotLecon(mLeconChoisi);

    }


    private static void getMotLecon (String choixLecon){

        switch (choixLecon){
            case "1":
                mTitre.setText("PRONOMS PERSONNELS");
                mMotLecon.setText("Je : \n\n" +
                        "Tu : \n\n" +
                        "Il/Elle : \n\n" +
                        "Nous : \n\n" +
                        "Vous : \n\n" +
                        "Ils :"
                );
                mMotTraduit.setText("Mè \n\n" +
                        "Ou \n\n" +
                        "A \n\n" +
                        "Di \n\n" +
                        "Ni \n\n" +
                        "Baa"

                );
                break;
            case "2":
                mTitre.setText("ETRE / AVOIR");
                mMotLecon.setText("Je suis : \n" +
                        "Tu es : \n" +
                        "Il/Elle est : \n" +
                        "Nous sommes : \n" +
                        "Vous êtes : \n" +
                        "Ils sont : \n\n" +
                        "J'ai : \n"+
                        "Tu as : \n" +
                        "Il/ Elle a : \n" +
                        "Nous avons : \n" +
                        "Vous avez : \n" +
                        "Ils ont :"

                );
                mMotTraduit.setText("Mè yé\n" +
                        "Ou yé\n" +
                        "A yé\n" +
                        "Di yé\n" +
                        "Ni yé\n" +
                        "Baa yé \n\n"+
                        "Mè gwé : \n"+
                        "Ou gwé : \n" +
                        "A gwé : \n" +
                        "Di gwé : \n" +
                        "Ni gwé : \n" +
                        "Baa gwé :"
                );
                break;
            case "3":
                mTitre.setText("VERBES");
                mMotLecon.setText("Acheter : \n\n" +
                        "Devoir : \n\n" +
                        "Pouvoir : \n\n" +
                        "Vivre : \n\n" +
                        "Partir : \n\n" +
                        "Cuisiner : \n\n" +
                        "Boire :"
                );
                mMotTraduit.setText("Sohmb \n\n" +
                        "Lama \n\n" +
                        "Mla \n\n" +
                        "Nigne \n\n" +
                        "Kèè \n\n" +
                        "Lahmb \n\n" +
                        "Nyow"

                );

                break;
            case "4":
                mTitre.setText("CHIFFRES");
                mMotLecon.setText("1 : \n" +
                        "2 : \n" +
                        "3 : \n" +
                        "4 : \n" +
                        "5: \n" +
                        "6 : \n" +
                        "7 : \n"+
                        "8 : \n" +
                        "9 : \n" +
                        "10 : "

                );
                mMotTraduit.setText("Yarha/Pok\n" +
                        "Ibaah\n" +
                        "Iaah\n" +
                        "Ina\n" +
                        "Itan\n" +
                        "Isamal \n"+
                        "Isambok \n"+
                        "Njeum \n" +
                        "Mbooh \n" +
                        "Njom "
                );

                break;
            case "5":
                mTitre.setText("MOTS");
                mMotLecon.setText("Voiture : \n" +
                        "Noir : \n" +
                        "Blanc : \n" +
                        "Demain : \n" +
                        "Magasin : \n" +
                        "Devant : \n" +
                        "Soir : \n"+
                        "Clé : \n" +
                        "Vacance : "

                );
                mMotTraduit.setText("Toha\n" +
                        "Hinda\n" +
                        "Pouba\n" +
                        "Iani\n" +
                        "Sabé\n" +
                        "Mbégdé \n"+
                        "Kogoha \n"+
                        "Liba \n" +
                        "Noye "
                );

                break;
            case "6":
                mTitre.setText("ADJECTIFS");
                mMotLecon.setText("Ton/ Ta/ Tes : \n\n" +
                        "Mon/ Ma / Mes : \n\n" +
                        "Et : \n\n" +
                        "Pour : \n\n" +
                        "Le / La / Les : \n\n" +
                        "Ce / Cette : \n\n" +
                        "Ces :"
                );
                mMotTraduit.setText("Jdon \n\n" +
                        "Djem \n\n" +
                        "Ni \n\n" +
                        "I nyu \n\n" +
                        "I \n\n" +
                        "Ini \n\n" +
                        "Mana"
                );
                break;
        }


    }
}