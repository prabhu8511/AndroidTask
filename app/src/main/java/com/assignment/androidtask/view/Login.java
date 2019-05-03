package com.assignment.androidtask.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.assignment.androidtask.App;
import com.assignment.androidtask.Constants;
import com.assignment.androidtask.R;
import com.assignment.androidtask.callbacks.LoginCallbacks;
import com.assignment.androidtask.databinding.ActivityLoginBinding;
import com.assignment.androidtask.helper.PrefUtils;
import com.assignment.androidtask.model.LoginViewModel;


public class Login extends AppCompatActivity implements LoginCallbacks, View.OnClickListener {

    private LoginViewModel mLoginViewModel;

    private ActivityLoginBinding mActivityLoginBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        mLoginViewModel = new LoginViewModel();
        mActivityLoginBinding.setLoginModel(mLoginViewModel);
        mLoginViewModel.setCallbacks(this);

    }

    //on Button click
    public void onClick(View v) {
        mLoginViewModel.isEmailAndPasswordValid(mActivityLoginBinding.etEmail.getText().toString(), mActivityLoginBinding.etPassword.getText().toString());
    }

    @Override
    public void openMainActivity() {
        PrefUtils.setBoolean(Constants.LOGIN, true, App.getAppContext());
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void loginError(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }


}
