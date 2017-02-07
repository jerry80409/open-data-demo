package com.example.services.google.trends;

import com.example.services.google.trends.entities.KeyWordsResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.HashMap;
import java.util.List;

/**
 * Created by jerry on 2017/2/7.
 */
public interface GoogleTrendsService {

    /**
     * E.g. id=2172797
     *
     * @return
     */
    @GET("visualize/internal/data")
    Call<KeyWordsResponse> trendsOfKeyWords();
}
