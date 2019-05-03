package com.assignment.androidtask.model;

import android.text.TextUtils;
import android.util.Patterns;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.assignment.androidtask.App;
import com.assignment.androidtask.Constants;
import com.assignment.androidtask.api.PostApi;
import com.assignment.androidtask.callbacks.LoginCallbacks;
import com.assignment.androidtask.helper.PrefUtils;
import com.assignment.androidtask.model.api.LoginResponse;
import com.assignment.androidtask.view.base.BaseViewModel;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginViewModel extends BaseViewModel<LoginCallbacks> {

    /*
    * validates username and password
    * */
    public void isEmailAndPasswordValid(String email, String password) {
        // validate email and password
        if (TextUtils.isEmpty(email)) {
            getCallbacks().loginError(Constants.EMPTY_EMAIL_MESSAGE);
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            getCallbacks().loginError(Constants.WRONG_EMAIL_FORMAT);
            return;
        }
        if (TextUtils.isEmpty(password)) {
            getCallbacks().loginError(Constants.EMPTY_PASSWORD);
            return;
        }

        login(email, password);

    }

    /*
    * Hits login API
    * */
    private void login(String email, String password) {

        JSONObject loginRequestParam = new JSONObject();
        try {
            loginRequestParam.put("email", email);
            loginRequestParam.put("password", password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        setIsLoading(true);

        final PostApi postApi = new PostApi(Request.Method.POST, Constants.LOGIN_URL, loginRequestParam, response -> {
            setIsLoading(false);
            LoginResponse loginResponse = new Gson().fromJson(response.toString(), LoginResponse.class);
            switch (loginResponse.getStatus()) {
                case 0:
                    getCallbacks().loginError(loginResponse.getMessage());
                    break;
                case 1:
                    PrefUtils.setDefaults(Constants.ACCESS_TOKEN, loginResponse.getData().getToken(), App.getAppContext());
                    PrefUtils.setDefaults(Constants.COMPANY_ID, String.valueOf(loginResponse.getData().getUser().getCompany().getId()), App.getAppContext());
                    getCallbacks().openMainActivity();
                    break;

            }
        }, error -> {
            setIsLoading(false);
            getCallbacks().loginError(Constants.ERROR_MESSAGE);

        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<>();
                headers.put(Constants.CONTENT_TYPE, "application/json");
                return headers;
            }
        };

        App.getVolleyQueue().add(postApi);

    }
}
