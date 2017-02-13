package com.qf.sxy.day36_design;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class ToolbarActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_toolbar);

        toolbar = ((Toolbar) findViewById(R.id.toolbar));


        //设置导航图标
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        //设置logo图片
        toolbar.setLogo(R.mipmap.d_doge);
        toolbar.setTitle("标题");
        toolbar.setTitleTextColor(Color.BLUE);
        toolbar.setSubtitle("子标题");



        //添加菜单属性
        toolbar.inflateMenu(R.menu.my_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_setting:
                        Toast.makeText(ToolbarActivity.this,"setting",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_about:
                        Toast.makeText(ToolbarActivity.this,"about",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_clear:
                        Toast.makeText(ToolbarActivity.this,"clear",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        //将toolbar进行关联
//         toolbar.setTitle("标题");之后设置setSupportActionBar(toolbar);
//        否则有的版本有问题  title不显示
//        setSupportActionBar(toolbar);

    }
}
