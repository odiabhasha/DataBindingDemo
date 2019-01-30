package com.jetpack.databinding2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jetpack.databinding2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contact content = new Contact("Priyabrat","pp@gmail.com");
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setContact(content);
    }
}
