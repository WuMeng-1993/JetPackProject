package com.wumeng.jetpackproject;

import android.app.Application;

import com.wumeng.jetpackproject.lifecycle.ForegroundCallbacks;

/**
 * @author WuMeng
 * @date 2020/9/2
 * desc:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ForegroundCallbacks.init(this);
    }
}
