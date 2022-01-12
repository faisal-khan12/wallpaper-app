package com.example.wallpaper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    private static  Retrofit retrofit=null;
    public static final String Api="563492ad6f91700001000001265e8f8285f94a1db5aa1f3c5b972339";
    public static ApiInterface getApiInterface() {

        if (retrofit==null){
            retrofit =new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
