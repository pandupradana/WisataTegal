package com.example.project.tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button btnwisata,btnmakanan,btnhotel,btnabout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnwisata = (Button)findViewById(R.id.btn_wisata);
        btnmakanan = (Button)findViewById(R.id.btn_makanan);
        btnhotel = (Button)findViewById(R.id.btn_hotel);
        btnabout = (Button)findViewById(R.id.btn_about);

        btnwisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wisata = new Intent(getApplicationContext(),menu_wisata.class);
                startActivity(wisata);
            }
        });

        btnmakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makanan = new Intent(getApplicationContext(),menu_makanan.class);
                startActivity(makanan);
            }
        });

        btnhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(getApplicationContext(),menu_hotel.class);
                startActivity(hotel);
            }
        });

        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(getApplicationContext(),menu_about.class);
                startActivity(about);
            }
        });

    }
}

