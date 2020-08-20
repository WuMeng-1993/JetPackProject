package com.wumeng.jetpackproject.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wumeng.jetpackproject.databinding.ActivityMainBinding;

/**
 * @author WuMeng
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 获取 ViewBinding 实例
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        // 给 Activity 设置视图
        setContentView(mainBinding.getRoot());

        mainBinding.textView.setText("textView1");
        mainBinding.textView2.setText("textView2");
    }
}