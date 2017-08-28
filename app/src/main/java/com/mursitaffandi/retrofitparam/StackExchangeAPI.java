package com.mursitaffandi.retrofitparam;

import com.mursitaffandi.retrofitparam.model.StackOverFlow;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ingat Mati on 23/08/2017.
 */

public interface StackExchangeAPI {
    public static String BASE_URL = "https://api.stackexchange.com/2.2/";

    // create Retrofit instance client
    Retrofit client = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    // put parameter GET request
    @GET("/search?")
    public Call<StackOverFlow> getQeustion(@Query("order") String Order,
                                           @Query("sort") String Sort,
                                           @Query("tagged") String Tagged,
                                           @Query("site") String Site
                                           );

}
