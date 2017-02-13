package com.qf.sxy.day36_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyClick(View view) {
        switch (view.getId()){
            case R.id.btn_textInputLayout://textInputLayoutActivity
                startActivity(new Intent(MainActivity.this,TextInputLayoutActivity.class));
                break;
            case R.id.btn_FlotingActionButtonActivity://FlotingActionButtonActivity
                startActivity(new Intent(MainActivity.this,FlotingActionButtonActivity.class));
                break;
            case R.id.btn_SnackBarActivity://SnackBarActivity
                startActivity(new Intent(MainActivity.this,SnackBarActivity.class));
                break;
            case R.id.btn_NavigationViewActivity://NavigationViewActivity
                startActivity(new Intent(MainActivity.this,NavigationViewActivity.class));
                break;
            case R.id.btn_ToolbarActivity://ToolbarActivity
                startActivity(new Intent(MainActivity.this,ToolbarActivity.class));
                break;
            case R.id.btn_Toolbar2Activity://Toolbar2Activity
                startActivity(new Intent(MainActivity.this,ToolBar2Activity.class));
                break;
            case R.id.btn_TabLayoutActivity://TabLayoutActivity
                startActivity(new Intent(MainActivity.this,TabLayoutActivity.class));
                break;
            case R.id.btn_NestedScrollViewActivity://NestedScrollViewActivity
                startActivity(new Intent(MainActivity.this,NestedScrollViewActivity.class));
                break;
            case R.id.btn_AppBarLayoutActivity://AppBarLayoutActivity
                startActivity(new Intent(MainActivity.this,AppBarLayoutActivity.class));
                break;
            case R.id.btn_CollapsingToolbarLayoutActivity://CollapsingToolbarLayoutActivity
                startActivity(new Intent(MainActivity.this,CollapsingToolbarLayoutActivity.class));
                break;
        }

    }
}
