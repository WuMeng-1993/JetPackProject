package com.wumeng.jetpackproject.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.wumeng.jetpackproject.R;

/**
 * @author WuMeng
 */
public class LifeCycleActivity extends AppCompatActivity {

    private static final String TAG = LifeCycleActivity.class.getSimpleName();

    int count = 0;

    /**
     * 是否计数
     */
    private boolean whetherToCount = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        whetherToCount = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (whetherToCount) {
                    try {
                        Thread.sleep(1000);
                        count++;
                        Log.d(TAG, "count ==" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "count ==" + count);
        whetherToCount = false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        whetherToCount = false;
        count = 0;
    }

}