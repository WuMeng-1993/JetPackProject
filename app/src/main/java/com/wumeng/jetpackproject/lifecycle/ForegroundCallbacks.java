package com.wumeng.jetpackproject.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author WuMeng
 * @date 2020/9/2
 * desc:
 */
public class ForegroundCallbacks implements Application.ActivityLifecycleCallbacks {

    private static final String TAG = ForegroundCallbacks.class.getSimpleName();

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
        Log.d(TAG,"onActivityCreated" + activity.getComponentName());
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        Log.d(TAG,"onActivityStarted" + activity.getComponentName());
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        Log.d(TAG,"onActivityResumed" + activity.getComponentName());
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {
        Log.d(TAG,"onActivityPaused" + activity.getComponentName());
    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {
        Log.d(TAG,"onActivityStopped" + activity.getComponentName());
    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
        Log.d(TAG,"onActivitySaveInstanceState" + activity.getComponentName());
    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        Log.d(TAG,"onActivityDestroyed" + activity.getComponentName());
    }

    private static ForegroundCallbacks instance;

    public static ForegroundCallbacks init(Application application) {
        instance = new ForegroundCallbacks();
        application.registerActivityLifecycleCallbacks(instance);
        return instance;
    }

}
