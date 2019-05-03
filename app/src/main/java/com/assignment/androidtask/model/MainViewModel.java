package com.assignment.androidtask.model;

import com.android.volley.AuthFailureError;
import com.assignment.androidtask.App;
import com.assignment.androidtask.Constants;
import com.assignment.androidtask.api.GetApi;
import com.assignment.androidtask.callbacks.MainCallback;
import com.assignment.androidtask.helper.PrefUtils;
import com.assignment.androidtask.model.api.MachineResponse;
import com.assignment.androidtask.view.base.BaseViewModel;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 03-05-2019.
 */

public class MainViewModel extends BaseViewModel<MainCallback> {

    /*
    * Called on swipe to refresh
    * */
    public void onRefresh() {
        fetchAssets();
    }

    /*
    *Get all items from the server
    * */
    public void fetchAssets() {

        setIsLoading(true);

        String assetsUrl = Constants.ASSETS_URL + PrefUtils.getDefaults(Constants.COMPANY_ID, App.getAppContext());

        GetApi getApi = new GetApi(response -> {
            setIsLoading(false);
            MachineResponse machineResponse = new Gson().fromJson(response.toString(), MachineResponse.class);
            if (machineResponse.getStatus() == 1 && machineResponse.getData().getAssets() != null && machineResponse.getData().getAssets().size() > 0) {
                setHasFailed(false);
                getCallbacks().assetsList(machineResponse.getData().getAssets());
            } else {
                setHasFailed(true);
            }


        }, error -> {
            setIsLoading(false);
            setHasFailed(true);


        }, assetsUrl) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<>();
                headers.put(Constants.CONTENT_TYPE, "application/json");
                headers.put(Constants.AUTHORIZATION, "Bearer " + PrefUtils.getDefaults(Constants.ACCESS_TOKEN, App.getAppContext()));
                return headers;
            }
        };
        App.getVolleyQueue().add(getApi);

    }
}
