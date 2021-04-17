package com.android.AndroidMovieList.network;

import com.android.AndroidMovieList.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("movies.json")
    Call<List<MovieModel>> getMovieList();
}
