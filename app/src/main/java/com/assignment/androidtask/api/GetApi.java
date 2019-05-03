package com.assignment.androidtask.api;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;


public class GetApi extends Request<JSONObject> {

    private Response.Listener<JSONObject> listener;

    public GetApi(Response.Listener<JSONObject> listener, Response.ErrorListener errorListener, String url) {
        super(Method.GET, url, errorListener);
        this.listener = listener;
        setRetryPolicy(new DefaultRetryPolicy(0,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
    }


    @Override
    protected Response<JSONObject> parseNetworkResponse(NetworkResponse response) {

        String jsonString = null;
        try {
            jsonString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            JSONObject obj = new JSONObject(jsonString);
            return Response.success(obj, HttpHeaderParser.parseCacheHeaders(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void deliverResponse(JSONObject jsonObject) {
        listener.onResponse(jsonObject);
    }

    @Override
    protected VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

}



