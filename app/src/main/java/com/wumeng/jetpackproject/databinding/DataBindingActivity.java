package com.wumeng.jetpackproject.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.wumeng.jetpackproject.R;

/**
 * @author WuMeng
 */
public class DataBindingActivity extends AppCompatActivity {

    private ActivityDataBindingBinding dataBindingBinding;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        user = new User();
        user.name.set("WU");
        user.password.set("WWW");
        dataBindingBinding.setUser(user);

        initView();
    }

    private void initView() {

        dataBindingBinding.btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.name.set("MENG");
            }
        });

    }

}