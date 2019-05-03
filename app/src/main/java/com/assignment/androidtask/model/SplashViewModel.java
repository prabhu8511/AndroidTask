package com.assignment.androidtask.model;

import com.assignment.androidtask.App;
import com.assignment.androidtask.Constants;
import com.assignment.androidtask.callbacks.SplashCallback;
import com.assignment.androidtask.helper.PrefUtils;
import com.assignment.androidtask.view.base.BaseViewModel;

public class SplashViewModel extends BaseViewModel<SplashCallback> {

    /**
     * Checks weather user is logged in or not and navigates the app to appropriate screen
     * */
    public void decideNextActivity() {
        setIsLoading(true);
        if (PrefUtils.getBoolean(Constants.LOGIN, App.getAppContext()))
            getCallbacks().openMainActivity();
        else getCallbacks().openLoginActivity();

    }

}
