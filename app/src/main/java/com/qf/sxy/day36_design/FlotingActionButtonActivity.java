package com.qf.sxy.day36_design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.qf.sxy.day36_design.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class FlotingActionButtonActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> list;

    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floting_action_button);

        recyclerView = ((RecyclerView) findViewById(R.id.recyclerView));
        //数据源
        list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("===11.11=断手="+i);
        }
        //adapter
        adapter = new MyAdapter(this,list);
        recyclerView.setAdapter(adapter);
        //布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
    }

    public void MyClick(View view) {
        Toast.makeText(FlotingActionButtonActivity.this,"点击了按钮",Toast.LENGTH_LONG).show();

        //recyclerView展示的位置
        recyclerView.smoothScrollToPosition(0);
//        ListView lv;
//        lv.setSelection(0);

    }
}
