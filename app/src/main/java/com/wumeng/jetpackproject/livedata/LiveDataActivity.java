package com.wumeng.jetpackproject.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.wumeng.jetpackproject.R;
import com.wumeng.jetpackproject.databinding.ActivityLiveDataBinding;


public class LiveDataActivity extends AppCompatActivity {

    private ActivityLiveDataBinding mLiveDataBinding;

    private LiveDataViewModel mLiveDataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLiveDataBinding = DataBindingUtil.setContentView(this,R.layout.activity_live_data);
        mLiveDataViewModel = new ViewModelProvider(this).get(LiveDataViewModel.class);
        getLifecycle().addObserver(new LiveDataLifecycle(mLiveDataViewModel));
    }
}