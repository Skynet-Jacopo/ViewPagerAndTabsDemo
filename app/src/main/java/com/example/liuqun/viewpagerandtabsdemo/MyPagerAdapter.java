package com.example.liuqun.viewpagerandtabsdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by 90516 on 5/29/2016.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "标题" + (position + 1);
    }
}
