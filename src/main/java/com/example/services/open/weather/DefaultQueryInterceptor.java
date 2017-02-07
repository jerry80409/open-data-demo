package com.example.services.open.weather;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by jerry on 2017/2/7.
 */
public class DefaultQueryInterceptor implements Interceptor {
    // TODO: 2017/2/7 Consider to application.properties
    private final String metric = "metric";
    private final String zhTw = "zh-tw";
    private String apiKey;

    public DefaultQueryInterceptor(String key) {
        this.apiKey = key;
    }

    /**
     * Add APPID Query Parameter
     *
     * @param chain {@link okhttp3.Interceptor.Chain}
     * @return {@link Response}
     * @throws IOException
     */
    @Override
    public Response intercept(Chain chain) throws IOException {
        HttpUrl keyQuery = chain.request().url()
                .newBuilder()
                .addQueryParameter("appid", this.apiKey)
                .addQueryParameter("units", metric)
                .addQueryParameter("lang", zhTw)
                .build();
        Request request = chain.request().newBuilder().url(keyQuery).build();
        return chain.proceed(request);
    }
}
