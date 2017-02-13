package com.qf.sxy.day36_design;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ToolBar2Activity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar2);
        toolbar = ((Toolbar) findViewById(R.id.toolbar));
        drawerLayout = ((DrawerLayout) findViewById(R.id.drawerLayout));


        toolbar.setTitle("AAAAAAAAAAAAAAAA");
        //  setSupportActionBar(toolbar);
        //toolBar和Drawerlayout开关进行绑定
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                ToolBar2Activity.this
                ,drawerLayout
                ,toolbar
                ,R.string.app_open
                ,R.string.app_close
        );
        //ActionBarDrawerToggle与drawerLayout状态同步
        toggle.syncState();
        //drawerLayout绑定toggle
        drawerLayout.addDrawerListener(toggle);





    }
}
