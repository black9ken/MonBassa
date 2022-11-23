package com.example.monbassa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnPronomsPersonnels ;
    private Button mBtnVerbeEtreAvoir ;
    private Button mBtnVerbe ;
    private Button mBtnChiffre ;
    private Button mBtnMotCourant ;
    private Button mBtnAdjectif ;
    private Button mBtnSectionLecon ;
    private Button mBtnSectionEvaluation ;
    private Button mBtnSectionAide ;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); // desactiver le mode night du téléphone
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnPronomsPersonnels = findViewById(R.id.main_activity_btn_lecon_pronoms);
        mBtnPronomsPersonnels.setText("Prenoms \n Personnels");
        mBtnVerbeEtreAvoir = findViewById(R.id.main_activity_btn_lecon_etreAvoir);
        mBtnVerbeEtreAvoir.setText("V: Etre/Avoir");
        mBtnVerbe = findViewById(R.id.main_activity_btn_lecon_verbe);
        mBtnVerbe.setText("V: Général");
        mBtnChiffre = findViewById(R.id.main_activity_btn_lecon_chiffre);
        mBtnChiffre.setText("Chiffre");
        mBtnMotCourant = findViewById(R.id.main_activity_btn_lecon_motCourant);
        mBtnMotCourant.setText("Mots \n Courants");
        mBtnAdjectif = findViewById(R.id.main_activity_btn_lecon_adjectif);
        mBtnAdjectif.setText("Adjectifs");
        mBtnSectionEvaluation = findViewById(R.id.main_activity_btn_evaluation);
        mBtnSectionEvaluation.setText("Evaluation");
        mBtnSectionAide = findViewById(R.id.main_activity_btn_aide);
        mBtnSectionAide.setText("Aide");
        mBtnSectionLecon = findViewById(R.id.main_activity_btn_lecon);
        mBtnSectionLecon.setText("Leçon");


        mBtnPronomsPersonnels.setOnClickListener(this);
        mBtnVerbeEtreAvoir.setOnClickListener(this);
        mBtnVerbe.setOnClickListener(this);
        mBtnChiffre.setOnClickListener(this);
        mBtnMotCourant.setOnClickListener(this);
        mBtnAdjectif.setOnClickListener(this);
        mBtnSectionEvaluation.setOnClickListener(this);
        mBtnSectionAide.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        if(view == mBtnPronomsPersonnels){
            Intent intent = new Intent(MainActivity.this, LeconActivity.class);
            intent.putExtra("choiceBtn","1");
            startActivity(intent);
        } if (view == mBtnVerbeEtreAvoir){
            Intent intent = new Intent(MainActivity.this, LeconActivity.class);
            intent.putExtra("choiceBtn","2");
            startActivity(intent);
        }if (view == mBtnVerbe){
            Intent intent = new Intent(MainActivity.this, LeconActivity.class);
            intent.putExtra("choiceBtn","3");
            startActivity(intent);
        }if (view == mBtnChiffre){
            Intent intent = new Intent(MainActivity.this, LeconActivity.class);
            intent.putExtra("choiceBtn","4");
            startActivity(intent);
        }if (view == mBtnMotCourant){
            Intent intent = new Intent(MainActivity.this, LeconActivity.class);
            intent.putExtra("choiceBtn","5");
            startActivity(intent);
        }if (view == mBtnAdjectif){
            Intent intent = new Intent(MainActivity.this, LeconActivity.class);
            intent.putExtra("choiceBtn","6");
            startActivity(intent);
        }if (view == mBtnSectionEvaluation){
            Intent intent = new Intent(MainActivity.this, EvaluationActivity.class);
            startActivity(intent);
        }if (view == mBtnSectionAide){
            Intent intent = new Intent(MainActivity.this, AideActivity.class);
            startActivity(intent);
        }
    }
}