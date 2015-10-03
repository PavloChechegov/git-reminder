package com.example.pavlo.planner.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.example.pavlo.planner.fragment.CurrentTaskFragment;
import com.example.pavlo.planner.fragment.DoneTaskFragment;

/**
 * Created by Pasha on 03.10.2015.
 */
public class TabAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new CurrentTaskFragment();
            case 1: return new DoneTaskFragment();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return 0;
    }
}
