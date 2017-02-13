package com.qf.sxy.day36_design;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TextInputLayoutActivity extends AppCompatActivity {

    private TextInputLayout textInputLayout;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        textInputLayout = ((TextInputLayout) findViewById(R.id.textInputLayout));
        et = ((EditText) findViewById(R.id.et));

    }

    public void MyClick(View view) {
        String str  = et.getText().toString().trim();
        if(TextUtils.isEmpty(str)){
            //是否开启错误提示
            textInputLayout.setErrorEnabled(true);
            //设置错误内容
            textInputLayout.setError("没有输入任何内容");
        }else{
            //关闭错误提示
            textInputLayout.setErrorEnabled(false);
//            textInputLayout.setErrorEnabled(false);
            textInputLayout.setError("");
            Toast.makeText(TextInputLayoutActivity.this,"银行卡剩余1个亿",Toast.LENGTH_SHORT).show();
        }
    }
}
