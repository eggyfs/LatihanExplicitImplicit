package com.example.eggyfernando.pertama.presenter;

import android.content.Context;
import android.content.Intent;

import com.example.eggyfernando.pertama.memek;

public class intentpresenter {
    public void intentExplisit(Context context){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_TEXT, "Intent Explisit");
        intent.putExtra(Intent.EXTRA_TITLE, "Coba Intent Explicit");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Aku nyoba intent explisit ya");
        context.startActivity(Intent.createChooser(intent, "Share Image"));
    }
    public void intentImplisit(Context context){
        context.startActivity(new Intent(context, memek.class));
    }
}
