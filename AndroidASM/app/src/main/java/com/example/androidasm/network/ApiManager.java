package com.example.androidasm.network;

import com.example.androidasm.model.BigData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    String SERVER = "https://springfilm.herokuapp.com";
    @GET("/apifree/home")
    Call<BigData> apiGetBigData();
}
