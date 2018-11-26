package com.example.qd.flowlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FlowLayout flowLayout;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flowLayout = findViewById(R.id.flowLayout);
        list = new ArrayList<>();
        list.add("哈哈哈");
        list.add("哈你妹");
        list.add("妹妹好啊，在干嘛");
        list.add("一起来玩");
        list.add("不了");
        list.add("那好吧");
        list.add("明天去哪里，去日本，去浪漫的土耳其");
        list.add("你去吧");
        list.add("哦");
        setFlowLayout();
    }
    private void setFlowLayout() {
        flowLayout.removeAllViews();
        //找到搜索标签的控件
        for (int i = 0; i < list.size(); i++) {
            LayoutInflater mInflater = LayoutInflater.from(this);
            TextView tv = (TextView) mInflater.inflate(
                    R.layout.flow_layout, flowLayout, false);
            tv.setText(list.get(i));
            //点击事件
            final int position = i;
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,list.get(position),Toast.LENGTH_SHORT).show();
                }
            });
            flowLayout.addView(tv);//添加到父View
        }
    }
}
