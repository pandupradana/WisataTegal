package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapteralun extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapteralun(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_alun tab1_alun = new Tab1_alun();
                return tab1_alun;
            case 1:
                Tab2_alun tab2_alun = new Tab2_alun();
                return  tab2_alun;
            case 2:
                Tab3_alun tab3_alun = new Tab3_alun();
                return  tab3_alun;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}

