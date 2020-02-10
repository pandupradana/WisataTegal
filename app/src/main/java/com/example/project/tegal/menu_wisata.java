package com.example.project.tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class menu_wisata extends AppCompatActivity implements View.OnClickListener {
    private CardView button_rita, button_guci, button_alun, button_poci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_wisata);
        button_rita = (CardView) findViewById(R.id.button_rita);
        button_guci = (CardView) findViewById(R.id.button_guci);
        button_alun = (CardView) findViewById(R.id.button_alun);
        button_poci = (CardView) findViewById(R.id.button_poci);

        button_rita.setOnClickListener(this);
        button_guci.setOnClickListener(this);
        button_alun.setOnClickListener(this);
        button_poci.setOnClickListener(this);


        Button btn = (Button) findViewById(R.id.button9);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(menu_wisata.this,MapsWisata.class);
                startActivity(i);
            }
        });


    }




    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()) {
            case R.id.button_rita:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.button_guci:
                i = new Intent(this, guci.class);
                startActivity(i);
                break;
            case R.id.button_alun:
                i = new Intent(this, alun.class);
                startActivity(i);
                break;
            case R.id.button_poci:
                i = new Intent(this, poci.class);
                startActivity(i);
                break;

            default:
                break;
        }

    }
}
