package com.wumeng.jetpackproject.main4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author WuMeng
 * @date 2020/11/4
 * desc:
 */
public class Main4ActivityViewModel extends ViewModel {

    private LiveData<Student> liveData;

    private MutableLiveData<Student> studentMutableLiveData = new MutableLiveData<>();

    public LiveData<Student> getLiveData() {
        return studentMutableLiveData;
    }

    public void setStudentMutableLiveData(Student studentMutableLiveData){
        this.studentMutableLiveData.setValue(studentMutableLiveData);
    }

}
