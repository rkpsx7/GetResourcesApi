package com.example.getresourcesapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/api/unknown/{id}")
    Call<Response> getResponse(@Path("id") int id);
}
