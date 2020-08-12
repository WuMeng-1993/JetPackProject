package com.wumeng.jetpackproject.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wumeng.jetpackproject.databinding.ActivityViewBindingUiBinding;
import com.wumeng.jetpackproject.databinding.LayoutMergeTestBinding;

/**
 * @author WuMeng
 */
public class ViewBindingActivity extends AppCompatActivity {

    private ActivityViewBindingUiBinding mBinding;

    private LayoutMergeTestBinding mergeTestBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 获取 ViewBinding 类实例
        mBinding = ActivityViewBindingUiBinding.inflate(getLayoutInflater());
        // 给 Activity 设置视图
        setContentView(mBinding.getRoot());

        // 设置TextView
        mBinding.tvText.setText("Hello I am From Main");

        // 设置include里面的TextView
        mBinding.layoutInclude.tvInclude.setText(" I am from include");

        // merge中的TextView
        mergeTestBinding = LayoutMergeTestBinding.bind(mBinding.getRoot());
        mergeTestBinding.tvMerge.setText(" I am from merge");
    }
}