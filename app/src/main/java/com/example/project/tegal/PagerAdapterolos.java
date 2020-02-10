package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapterolos extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapterolos(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_olos tab1_olos = new Tab1_olos();
                return tab1_olos;
            case 1:
                Tab2_olos tab2_olos = new Tab2_olos();
                return  tab2_olos;
            case 2:
                Tab3_olos tab3_olos = new Tab3_olos();
                return  tab3_olos;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}

