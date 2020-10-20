package com.wumeng.jetpackproject.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

/**
 * @author WuMeng
 * @date 2020/10/13
 * desc:
 */
public class MainActivityViewModel extends AndroidViewModel {

    public int count = 0;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

}
