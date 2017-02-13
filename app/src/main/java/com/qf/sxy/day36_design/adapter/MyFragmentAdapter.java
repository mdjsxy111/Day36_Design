package com.qf.sxy.day36_design.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by sxy on 2016/11/14.
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> list;
    private List<String> titles;//书签
    public MyFragmentAdapter(FragmentManager fm, List<Fragment> list,List<String> titles) {
        super(fm);
        this.list = list;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    //展示书签
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
