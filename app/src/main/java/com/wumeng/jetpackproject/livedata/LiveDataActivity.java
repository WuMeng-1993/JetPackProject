package com.wumeng.jetpackproject.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.wumeng.jetpackproject.R;
import com.wumeng.jetpackproject.databinding.ActivityLiveDataBinding;


/**
 * @author WuMeng
 */
public class LiveDataActivity extends AppCompatActivity {

    private ActivityLiveDataBinding mLiveDataBinding;

    private LiveDataViewModel mLiveDataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DataBinding
        mLiveDataBinding = DataBindingUtil.setContentView(this,R.layout.activity_live_data);

        // ViewModel
        mLiveDataViewModel = new ViewModelProvider(this).get(LiveDataViewModel.class);
        mLiveDataViewModel.setCountValue(0);

        getLifecycle().addObserver(new LiveDataLifecycle(mLiveDataViewModel));

        mLiveDataViewModel.getCount().observeForever(new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                mLiveDataBinding.tvCount.setText(String.valueOf(integer));
            }
        });
    }
}