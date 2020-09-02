package com.wumeng.jetpackproject.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wumeng.jetpackproject.databinding.ActivityLifeCycle1Binding;

/**
 * 不管用
 * @author WuMeng
 */
public class LifeCycle1Activity extends AppCompatActivity {

    private ActivityLifeCycle1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLifeCycle1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LifeCycle1Activity.this,LifeCycleActivity.class));
            }
        });
    }
}