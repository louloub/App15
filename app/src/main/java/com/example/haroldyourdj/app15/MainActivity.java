package com.example.haroldyourdj.app15;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

    private AutoCompleteTextView complete = null;

    // Notre liste de mots que connaîtra l'AutoCompleteTextView
    private static final String[] COULEUR = new String[] {
            "Bleu", "Vert", "Jaune", "Jaune canari", "Rouge", "Orange"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On récupère l'AutoCompleteTextView déclaré dans notre layout
        complete = (AutoCompleteTextView) findViewById(R.id.complete);

        // Nombre de caractères à partir duquel on propose des mots
        complete.setThreshold(2);

        // On associe un adaptateur à notre liste de couleurs…
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, COULEUR);

        // … puis on indique que notre AutoCompleteTextView utilise cet adaptateur
        complete.setAdapter(adapter);
    }
}