package com.wumeng.jetpackproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.wumeng.jetpackproject.R;
import com.wumeng.jetpackproject.lifecycle.WorkUtil;
import com.wumeng.jetpackproject.viewmodel.MainActivityViewModel;


/**
 * @author WuMeng
 */
public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        getLifecycle().addObserver(new WorkUtil(mainActivityViewModel));
    }

}