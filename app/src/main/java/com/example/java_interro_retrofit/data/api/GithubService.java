package com.example.java_interro_retrofit.data.api;

import com.example.java_interro_retrofit.data.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GithubService {

    @GET("/search/users")
    Call<User> getUser(
        @Query("q") String q
    );
}
