package com.example.mcnutt.inclassdemo.datamodels;

import android.content.Context;
import android.support.annotation.NonNull;

import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

public class InspirationalQuoteModel {

    private final String inspirationalQuoteBaseUrl = "http://quotesondesign.com/wp-json/posts?filter[orderby]=rand&filter[posts_per_page]=1";
    private RequestQueue queue;

    public InspirationalQuoteModel(Context context) {
        queue = Volley.newRequestQueue(context);
    }

    public void getRandomInspirationalQuote(Response.Listener<JSONArray> listener, Response.ErrorListener errorListener) {
        JsonArrayRequest request = new JsonArrayRequest(inspirationalQuoteBaseUrl, listener, errorListener);
        queue.add(request);
    }

}