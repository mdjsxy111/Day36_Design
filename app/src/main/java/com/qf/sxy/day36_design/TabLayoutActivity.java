package com.qf.sxy.day36_design;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qf.sxy.day36_design.adapter.MyFragmentAdapter;
import com.qf.sxy.day36_design.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private List<Fragment> fragments;

    private MyFragmentAdapter myFragmentAdapter;
    private List<String> mTitls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        tabLayout = ((TabLayout) findViewById(R.id.tabLayout));
        viewPager = ((ViewPager) findViewById(R.id.viewPager));
        //给ViewPager 添加数据
        fragments = new ArrayList<>();
        mTitls = new ArrayList<>();

        //获取数据
        for (int i = 0; i < 4; i++) {
            fragments.add(new MyFragment());
            mTitls.add("书签"+i);
        }

        //缺少Adapter
        myFragmentAdapter = new MyFragmentAdapter(getSupportFragmentManager(),fragments,mTitls);

        viewPager.setAdapter(myFragmentAdapter);

        //tabLayout 和ViewPager关联
        tabLayout.setupWithViewPager(viewPager);
        //改模式
       // tabLayout.setTabMode();



    }
}
