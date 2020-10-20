package com.wumeng.jetpackproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.wumeng.jetpackproject.databinding.ActivityMainBinding;
import com.wumeng.jetpackproject.lifecycle.WorkUtil;
import com.wumeng.jetpackproject.viewmodel.MainActivityViewModel;


/**
 * @author WuMeng
 */
public class MainActivity extends AppCompatActivity {

    /**
     * ViewBinding
     */
    private ActivityMainBinding activityMainBinding;

    private MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.bind(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.textView.setText("View");
        activityMainBinding.textView2.setText("binding");
        activityMainBinding.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
            }
        });
        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        getLifecycle().addObserver(new WorkUtil(mainActivityViewModel));
    }

}