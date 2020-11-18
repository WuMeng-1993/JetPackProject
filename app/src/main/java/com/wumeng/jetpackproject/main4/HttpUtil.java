package com.wumeng.jetpackproject.main4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/**
 * @author WuMeng
 * @date 2020/11/18
 * desc:
 */
public class HttpUtil {

    public LiveData<Student> getStudent(int score) {
        MutableLiveData<Student> studentMutableLiveData = new MutableLiveData<>();
        Student student = new Student();
        student.setStuName("吴小猛");
        student.setStuNumber(802);
        student.setStuScore(98);
        studentMutableLiveData.setValue(student);
        return studentMutableLiveData;
    }

}
