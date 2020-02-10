package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class PagerAdapterprimebiz extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapterprimebiz(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_primebiz tab1_primebiz = new Tab1_primebiz();
                return tab1_primebiz;
            case 1:
                Tab2_primebiz tab2_primebiz = new Tab2_primebiz();
                return  tab2_primebiz;
            case 2:
                Tab3_primebiz tab3_primebiz = new Tab3_primebiz();
                return  tab3_primebiz;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}