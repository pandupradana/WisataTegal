package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdaptersauto_tauco extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdaptersauto_tauco(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_sauto_tauco tab1_sauto_tauco = new Tab1_sauto_tauco();
                return tab1_sauto_tauco;
            case 1:
                Tab2_sauto_tauco tab2_sauto_tauco = new Tab2_sauto_tauco();
                return  tab2_sauto_tauco;
            case 2:
                Tab3_sauto_tauco tab3_sauto_tauco = new Tab3_sauto_tauco();
                return  tab3_sauto_tauco;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}

