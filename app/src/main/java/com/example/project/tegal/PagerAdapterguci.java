package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapterguci extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapterguci(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_guci tab1_guci = new Tab1_guci();
                return tab1_guci;
            case 1:
                Tab2_guci tab2_guci = new Tab2_guci();
                return  tab2_guci;
            case 2:
                Tab3_guci tab3_guci = new Tab3_guci();
                return  tab3_guci;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
