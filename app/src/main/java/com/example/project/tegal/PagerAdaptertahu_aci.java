package com.example.project.tegal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdaptertahu_aci extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdaptertahu_aci(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Tab1_tahu_aci tab1_tahu_aci = new Tab1_tahu_aci();
                return tab1_tahu_aci;
            case 1:
                Tab2_tahu_aci tab2_tahu_aci = new Tab2_tahu_aci();
                return  tab2_tahu_aci;
            case 2:
                Tab3_tahu_aci tab3_tahu_aci = new Tab3_tahu_aci();
                return  tab3_tahu_aci;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
