package com.qf.sxy.day36_design;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SnackBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
    }

    //展示Toast
    public void MyToastClick(View view) {
        Toast.makeText(SnackBarActivity.this,"我是Toast",Toast.LENGTH_SHORT).show();
    }

    //SnackBar
    public void MySnackBarClick(View view) {
        Snackbar.make(view,"双十一",Snackbar.LENGTH_SHORT)
                .setAction("许中", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("AAA","去他家串门");
                    }
                })
                .setCallback(new Snackbar.Callback() {
                    //消失
                    @Override
                    public void onDismissed(Snackbar snackbar, int event) {
                        super.onDismissed(snackbar, event);
                        Log.e("AAA","吃点就行");
                    }

                    //展示
                    @Override
                    public void onShown(Snackbar snackbar) {
                        super.onShown(snackbar);
                        Log.e("AAA","买好多吃的");
                    }
                })
                .show();
    }
}
