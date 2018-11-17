package com.example.eggyfernando.pertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eggyfernando.pertama.presenter.intentpresenter;

public class awal extends AppCompatActivity {
    Button btnIntentExplicit;
    Button btnIntentImplicit;
    intentpresenter intentpresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);
        // TODO menyambungkan antara Java ke XML dengan bantuan findViewById
        btnIntentExplicit = findViewById(R.id.btn_intent_explicit);
        btnIntentImplicit = findViewById(R.id.btn_intent_implicit);
        intentpresenter = new intentpresenter();
        btnIntentExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentpresenter.intentExplisit(awal.this);
            }
        });
        btnIntentImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentpresenter.intentImplisit(awal.this);
            }
        });
    }
}
