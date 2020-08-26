package com.wumeng.jetpackproject.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.wumeng.jetpackproject.R;
import com.wumeng.jetpackproject.bean.User;

/**
 * @author WuMeng
 */
public class Main2Activity extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);
        User user = new User();
        user.setUserName("吴猛");
        user.setUserAge("25");
        binding.setUser(user);
    }
}