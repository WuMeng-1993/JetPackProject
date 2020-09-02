package com.wumeng.jetpackproject.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @author WuMeng
 */
public class WorkUtil implements LifecycleObserver {

    private static final String TAG = "WorkUtil";

    private int count = 0;

    private boolean whetherToCount = true;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (whetherToCount) {
                    try {
                        Thread.sleep(1000);
                        count++;
                        Log.d("WM", "start" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        whetherToCount = false;
        Log.d("WM", "pause" + count);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestory() {
        count = 0;
        Log.d("WM", "onDestory" + count);
    }

}
