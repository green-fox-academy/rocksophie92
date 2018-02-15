package com.sophiecodes.matchmakertinder.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    private static int NUM_PAGES =0;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ViewPageFragment();
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
