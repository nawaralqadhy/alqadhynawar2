package com.example.nawaralqadhy.alqadhynawar2;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nawaralqadhy.alqadhynawar2.adapter.ViewPagerAdapter;
import com.example.nawaralqadhy.alqadhynawar2.fragment.ContentFragment;
import com.example.nawaralqadhy.alqadhynawar2.fragment.HistoryFragment;
import com.example.nawaralqadhy.alqadhynawar2.fragment.LoginFragment;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

        private ViewPager viewPager;
        private  ArrayList<Fragment> fragmentList= new ArrayList<Fragment>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initial();

    }
    private void initial (){
         viewPager = ( ViewPager)  findViewById(R.id.view_pager);
        fragmentList.add ( new LoginFragment());
        fragmentList.add ( new ContentFragment());
        fragmentList.add ( new HistoryFragment());
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent (fragmentList);
        viewPager.setAdapter(viewPagerAdapter);
        //tabLayout = (TabLayout) findViewById(R.id.tablayout);


    }
}
