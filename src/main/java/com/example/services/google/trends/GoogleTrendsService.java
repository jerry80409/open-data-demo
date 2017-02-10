package com.example.services.google.trends;

import com.example.services.google.trends.entities.KeyWordsResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by jerry on 2017/2/7.
 */
public interface GoogleTrendsService {

    /**
     * @return
     */
    @GET("visualize/internal/data")
    Call<KeyWordsResponse> trendsOfKeyWords();

    /**
     * curl 'https://www.google.com.tw/trends/hottrends/hotItems'
     * -H 'Referer: https://www.google.com.tw/trends/hottrends'
     * -H 'Origin: https://www.google.com.tw'
     * -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36'
     * -H 'Content-Type: application/x-www-form-urlencoded;charset=UTF-8'
     * --data 'ajax=1&pn=p12&htd&htv=l' --compressed
     */
    @Headers("Referer: https://www.google.com.tw/trends/hottrends")
    @FormUrlEncoded
    @POST("hotItems")
    Call<ResponseBody> trendsOfHotItems(@Field("ajax") String ajax,
                                        @Field("pn") String pn,
                                        @Field("htd") String htd,
                                        @Field("htv") String htv);

}
