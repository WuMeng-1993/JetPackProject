package com.wumeng.jetpackproject.main4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.wumeng.jetpackproject.R;
import com.wumeng.jetpackproject.databinding.ActivityMain4Binding;

/**
 * @author WuMeng
 */
public class Main4Activity extends AppCompatActivity {

    private ActivityMain4Binding main4Binding;

    private Main4ActivityViewModel main4ViewModel;

    private Student mStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main4Binding = DataBindingUtil.setContentView(this,R.layout.activity_main4);
        main4ViewModel = new ViewModelProvider(this).get(Main4ActivityViewModel.class);
        initData();
        initClick();
        observeData();
    }

    private void initData() {
        mStudent = new Student();
        mStudent.setStuName("吴猛");
        mStudent.setStuNumber(20121112);
        mStudent.setStuScore(0);
        main4Binding.setStudent(mStudent);
    }

    private void initClick() {
        main4Binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStudent.setStuScore(Integer.parseInt(main4Binding.etScore.getText().toString()));
                main4ViewModel.setStudentMutableLiveData(mStudent);
            }
        });
    }

    private void observeData() {
        main4ViewModel.getLiveData().observe(this, new Observer<Student>() {
            @Override
            public void onChanged(Student student) {
                main4Binding.tvStuscore.setText("分数: " + student.getStuScore());
            }
        });
    }

}