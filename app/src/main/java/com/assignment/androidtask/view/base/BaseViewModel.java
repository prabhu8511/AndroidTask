package com.assignment.androidtask.view.base;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableBoolean;

public abstract class BaseViewModel<N> extends ViewModel {

    private final ObservableBoolean mIsLoading = new ObservableBoolean(false);

    private final ObservableBoolean mHasFailed = new ObservableBoolean(false);

    private N mCallback;


    @Override
    protected void onCleared() {
        super.onCleared();
    }


    public ObservableBoolean getIsLoading() {
        return mIsLoading;
    }

    public void setIsLoading(boolean isLoading) {
        mIsLoading.set(isLoading);
    }

    public ObservableBoolean getHasFailed() {
        return mHasFailed;
    }

    public void setHasFailed(boolean hasFailed) {
        mHasFailed.set(hasFailed);
    }

    public N getCallbacks() {
        return mCallback;
    }

    public void setCallbacks(N callbacks) {
        this.mCallback = callbacks;
    }





}
