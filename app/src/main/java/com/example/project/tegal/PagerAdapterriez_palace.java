package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapterriez_palace extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapterriez_palace(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_riez_palace tab1_riez_palace = new Tab1_riez_palace();
                return tab1_riez_palace;
            case 1:
                Tab2_riez_palace tab2_riez_palace = new Tab2_riez_palace();
                return  tab2_riez_palace;
            case 2:
                Tab3_riez_palace tab3_riez_palace = new Tab3_riez_palace();
                return  tab3_riez_palace;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
