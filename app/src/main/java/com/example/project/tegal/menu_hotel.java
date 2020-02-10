package com.example.project.tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class menu_hotel extends AppCompatActivity implements View.OnClickListener {
    private CardView button_pesonna,button_riezpalace,button_primebiz,button_karlita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hotel);

        button_pesonna =(CardView) findViewById(R.id.button_pesonna);
        button_riezpalace =(CardView) findViewById(R.id.button_riezpalace);
        button_primebiz =(CardView) findViewById(R.id.button_primebiz);
        button_karlita =(CardView) findViewById(R.id.button_karlita);

        button_pesonna.setOnClickListener(this);
        button_riezpalace.setOnClickListener(this);
        button_primebiz.setOnClickListener(this);
        button_karlita.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()) {
            case R.id.button_pesonna:
                i = new Intent(this, pesonna.class);
                startActivity(i);
                break;
            case R.id.button_riezpalace:
                i = new Intent(this, riez_palace.class);
                startActivity(i);
                break;
            case R.id.button_primebiz:
                i = new Intent(this, primebiz.class);
                startActivity(i);
                break;
            case R.id.button_karlita:
                i = new Intent(this, karlita.class);
                startActivity(i);
                break;

            default:
                break;
        }

    }
}

