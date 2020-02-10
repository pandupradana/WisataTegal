package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapterpoci extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapterpoci(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_poci tab1_poci = new Tab1_poci();
                return tab1_poci;
            case 1:
                Tab2_poci tab2_poci = new Tab2_poci();
                return  tab2_poci;
            case 2:
                Tab3_poci tab3_poci = new Tab3_poci();
                return  tab3_poci;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
