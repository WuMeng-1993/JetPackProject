package com.wumeng.jetpackproject.livedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author WuMeng
 * @date 2020/10/28
 * desc: ViewModel
 */
public class LiveDataViewModel extends ViewModel {

    private final MutableLiveData<Integer> mCount = new MutableLiveData<>();

    public void setCountValue(int count) {
        this.mCount.setValue(count);
    }

    public LiveData<Integer> getCount() {
        return mCount;
    }


    public void add() {
        mCount.postValue(mCount.getValue() + 1);
    }
}
