package com.example.library;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent i;

        switch (v.getId()){
            case R.id.c1:
                i = new Intent(this,kategori.class);
                startActivity(i);
                break;
            case R.id.c2:
                i = new Intent(this,pinjaman.class);
                startActivity(i);
                break;
            case R.id.c3:
                i = new Intent(this,pengembalian.class);
                startActivity(i);
                break;
            case R.id.c4:
                i = new Intent(this,help.class);
                startActivity(i);
                break;

        }

    }
}