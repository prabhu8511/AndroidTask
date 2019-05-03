package com.assignment.androidtask.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.assignment.androidtask.R;
import com.assignment.androidtask.callbacks.SplashCallback;
import com.assignment.androidtask.databinding.ActivitySplashBinding;
import com.assignment.androidtask.model.SplashViewModel;

public class Splash extends AppCompatActivity implements SplashCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding binding =  DataBindingUtil.setContentView(this,R.layout.activity_splash);
        SplashViewModel splashViewModel = new SplashViewModel();
        binding.setViewModel(splashViewModel);
        splashViewModel.setCallbacks(this);
        splashViewModel.decideNextActivity();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = new Intent();
        intent.setClass(Splash.this, Login.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void openMainActivity() {
        Intent intent = new Intent();
        intent.setClass(Splash.this, MainPage.class);
        startActivity(intent);
        finish();
    }
}
