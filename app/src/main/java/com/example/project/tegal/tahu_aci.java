package com.example.project.tegal;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class tahu_aci extends AppCompatActivity implements Tab1_tahu_aci.OnFragmentInteractionListener, Tab2_tahu_aci.OnFragmentInteractionListener, Tab3_tahu_aci.OnFragmentInteractionListener {
    CarouselView carouselView;

    int[] sampleImages = {R.drawable.tahu_1, R.drawable.tahu_2, R.drawable.tahu_3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahu_aci);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Deskripsi"));
        tabLayout.addTab(tabLayout.newTab().setText("Bahan - Bahan"));
        tabLayout.addTab(tabLayout.newTab().setText("Cara Membuat"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PagerAdaptertahu_aci adapter = new PagerAdaptertahu_aci(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}

