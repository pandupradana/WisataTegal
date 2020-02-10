package com.example.project.tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class menu_makanan extends AppCompatActivity implements View.OnClickListener{
    private CardView button_soto,button_tahu,button_olos,button_glotak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);
        button_soto =(CardView) findViewById(R.id.button_soto);
        button_tahu =(CardView) findViewById(R.id.button_tahu);
        button_olos =(CardView) findViewById(R.id.button_olos);
        button_glotak =(CardView) findViewById(R.id.button_glotak);

        button_soto.setOnClickListener(this);
        button_tahu.setOnClickListener(this);
        button_olos.setOnClickListener(this);
        button_glotak.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()) {
            case R.id.button_soto:
                i = new Intent(this, sauto_tauco.class);
                startActivity(i);
                break;
            case R.id.button_tahu:
                i = new Intent(this, tahu_aci.class);
                startActivity(i);
                break;
            case R.id.button_olos:
                i = new Intent(this, olos.class);
                startActivity(i);
                break;
            case R.id.button_glotak:
                i = new Intent(this, glotak.class);
                startActivity(i);
                break;

            default:
                break;
        }

    }
}