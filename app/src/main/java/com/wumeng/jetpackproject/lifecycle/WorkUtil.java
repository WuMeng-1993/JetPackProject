package com.wumeng.jetpackproject.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.wumeng.jetpackproject.viewmodel.MainActivityViewModel;

/**
 * @author WuMeng
 */
public class WorkUtil implements LifecycleObserver {

    private static final String TAG = "WorkUtil";

    private int count = 0;

    private boolean whetherToCount = true;

    private MainActivityViewModel mainActivityViewModel;

    public WorkUtil(MainActivityViewModel mainActivityViewModel) {
        this.mainActivityViewModel = mainActivityViewModel;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (whetherToCount) {
                    try {
                        Thread.sleep(1000);
                        mainActivityViewModel.count++;
                        Log.d("WM", "start" + mainActivityViewModel.count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop() {
        whetherToCount = false;
        Log.d("WM", "stop" + mainActivityViewModel.count);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestory() {
        Log.d("WM", "onDestory" + mainActivityViewModel.count);
    }

}
