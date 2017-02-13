package com.qf.sxy.day36_design;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NavigationViewActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);
        drawerLayout = ((DrawerLayout) findViewById(R.id.drawerLayout));
        navigationView = ((NavigationView) findViewById(R.id.navigationView));

        //获取头部局
        View view = navigationView.getHeaderView(0);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NavigationViewActivity.this,"只吃好吃的",Toast.LENGTH_SHORT).show();
            }
        });

        //获取menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_setting:
                        Toast.makeText(NavigationViewActivity.this,"设置",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_about:
                        Toast.makeText(NavigationViewActivity.this,"关于",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_clear:
                        Toast.makeText(NavigationViewActivity.this,"清除",Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });


    }
}
