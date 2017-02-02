package com.example.nawaralqadhy.alqadhynawar2.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by nawaralqadhy on 2/1/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment>fragmentList = new ArrayList<Fragment>();
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentList.get(position).getClass().getName();
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    public void setContent (ArrayList<Fragment> fragmentList) {
        this.fragmentList = fragmentList;

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}

