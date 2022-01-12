package com.example.wallpaper;

import static com.google.android.gms.common.internal.service.Common.API;

import com.google.android.gms.common.api.Api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import static com.example.wallpaper.ApiUtilities.Api;

public interface ApiInterface {
    String BASE_URL = "https://api.pexels.com/v1/";

    @Headers("Authorization: "+Api)
    @GET("curated")
    Call<SearchModel>getImage(
            @Query("page") int page,
            @Query("per_page") int per_page
    );

    @Headers("Authorization: "+Api)
    @GET("search")
    Call<SearchModel>getImage(
            @Query("query")String query,
            @Query("page") int page,
            @Query("per_page") int per_page
    );

}


