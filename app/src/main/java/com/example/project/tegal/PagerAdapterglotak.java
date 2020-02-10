package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapterglotak extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapterglotak(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_glotak tab1_glotak = new Tab1_glotak();
                return tab1_glotak;
            case 1:
                Tab2_glotak tab2_glotak = new Tab2_glotak();
                return  tab2_glotak;
            case 2:
                Tab3_glotak tab3_glotak = new Tab3_glotak();
                return  tab3_glotak;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
