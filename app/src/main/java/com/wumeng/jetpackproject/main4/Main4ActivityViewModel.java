package com.wumeng.jetpackproject.main4;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

/**
 * @author WuMeng
 * @date 2020/11/4
 * desc:
 */
public class Main4ActivityViewModel extends ViewModel {

    private final MutableLiveData<Student> studentMutableLiveData = new MutableLiveData<>();

    public void setStudentMutableLiveData(Student studentMutableLiveData){
        this.studentMutableLiveData.setValue(studentMutableLiveData);
    }

    public LiveData<Student> getLiveData() {
        return studentMutableLiveData;
    }

    private LiveData<Integer> stuScore;

    public LiveData<Integer> getStuScore() {
        return stuScore;
    }

    public Main4ActivityViewModel() {
        stuScore = Transformations.map(studentMutableLiveData, new Function<Student, Integer>() {
            @Override
            public Integer apply(Student input) {
                return input.getStuScore();
            }
        });
    }

    public LiveData<Student> getStudentMessage(int score) {
        return new HttpUtil().getStudent(score);
    }

}
