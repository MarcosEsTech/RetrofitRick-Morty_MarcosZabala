package com.example.ejerretrofit;

import android.database.CursorJoiner;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface RetrofitService {
    @GET("character")
    Call<CursorJoiner.Result> getData();

    @GET("character/{id}")
    Call<Character> getCharacterById(@Path("id") int id);
}
