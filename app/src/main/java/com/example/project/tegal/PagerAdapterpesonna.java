package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapterpesonna extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapterpesonna(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_pesonna tab1_pesonna = new Tab1_pesonna();
                return tab1_pesonna;
            case 1:
                Tab2_pesonna tab2_pesonna = new Tab2_pesonna();
                return  tab2_pesonna;
            case 2:
                Tab3_pesonna tab3_pesonna = new Tab3_pesonna();
                return  tab3_pesonna;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
