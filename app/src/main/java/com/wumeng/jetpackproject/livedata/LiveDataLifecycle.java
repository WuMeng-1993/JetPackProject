package com.wumeng.jetpackproject.livedata;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @author WuMeng
 * @date 2020/10/28
 * desc:
 */
public class LiveDataLifecycle implements LifecycleObserver {

    private final LiveDataViewModel mLiveDataViewModel;

    private boolean whetherToCount = true;

    public LiveDataLifecycle(LiveDataViewModel mLiveDataViewModel) {
        this.mLiveDataViewModel = mLiveDataViewModel;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onResume() {
        if (whetherToCount) {
            Log.d("WM","onResume" + mLiveDataViewModel.count);
            mLiveDataViewModel.count++;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        whetherToCount = false;
        Log.d("WM","onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        mLiveDataViewModel.count = 0;
        Log.d("WM","onDestroy");
    }

}
