package com.qf.sxy.day36_design;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class CollapsingToolbarLayoutActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);

//        toolbar = ((Toolbar) findViewById(R.id.toolbar));
//        setSupportActionBar(toolbar);

        collapsingToolbarLayout = ((CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout));


        //展示是标题的颜色
        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);
        //折叠时标题的颜色
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.BLUE);
    }
}
