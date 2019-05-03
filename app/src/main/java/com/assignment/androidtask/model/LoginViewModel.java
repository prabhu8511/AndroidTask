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

        //login(email, password);

        PrefUtils.setDefaults(Constants.ACCESS_TOKEN, "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjM2MjljYzUzYTgwNmIyNWFjNGRjYTQ1Y2RkNjgzMzFjOGE3MjMzMzYzYTY1YWVkZjAxZTJlZDJlM2YzZWRmZTk3YmI2MjVhMzc3YTAzMWJiIn0.eyJhdWQiOiIzIiwianRpIjoiMzYyOWNjNTNhODA2YjI1YWM0ZGNhNDVjZGQ2ODMzMWM4YTcyMzMzNjNhNjVhZWRmMDFlMmVkMmUzZjNlZGZlOTdiYjYyNWEzNzdhMDMxYmIiLCJpYXQiOjE1NTY4NzQ2ODIsIm5iZiI6MTU1Njg3NDY4MiwiZXhwIjoxNTg4NDk3MDgyLCJzdWIiOiI3Iiwic2NvcGVzIjpbXX0.awsMI04RBzCrvfVwE2At1Q0K-XHpVTeueHQVOKW-Z_f-7p8QG3aJEirmbZWR54ybKrEbaWLLguyj_wAqOwvCB_hSaBZJi8M5t6KvofY1QnkkoQIBqXyPhx2cwdOyzMP7u1nPeEHqA2QJoO_1dJbYxBSLJi-_vKapWNA5rZDzEf4I0HUABnWLzYfH9Pe1uGUa-xdLPZz1PkLlCJeSN0IvPdW4uBzL_HqBn3tAFRQcjGpObWqsCVP3FaYfVjDwJuQYFoP5Tpzcycb2HyANaN0cwmuiCz8jd0A0vRdOAEBZlvqvHxlnI9PDY2TfLJMso649CyNVGECxfHSJNcs2IItduusLfzGQgHfFNtowSTmFuO9aP9K1hdNn7ZhJIYx8uHy2ezhRKTIGUGVaVqBiupJ7lCIJSrodSVhmKdIo8JICorHd7GErIF6maSgPhfCS1693F8r_uWxciY-da919wtUFxJzLw94xpJBbcl2UExuPrk0zXXIwhR3HR0DHLu4XnqAVGKIFJG4X4T_7MtdlosiIFQJiJPQDDFQjoBlgbjk2jSIFoTxVYEOLKGNVFUTqaL0FthGA36jiseeUTmd5t6hCEgrIXSih-IgbvqZDLCjD8hP6zbioOtAmkTNffYVcWUsxYfn18gClOUSE6PLYRnvX67hn2uX0TrX4AM0WZe-oOr0", App.getAppContext());
        PrefUtils.setDefaults(Constants.COMPANY_ID, String.valueOf(2), App.getAppContext());
        getCallbacks().openMainActivity();
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
