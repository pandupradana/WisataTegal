package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapterkarlita extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapterkarlita(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_karlita tab1_karlita = new Tab1_karlita();
                return tab1_karlita;
            case 1:
                Tab2_karlita tab2_karlita = new Tab2_karlita();
                return  tab2_karlita;
            case 2:
                Tab3_karlita tab3_karlita = new Tab3_karlita();
                return  tab3_karlita;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}

