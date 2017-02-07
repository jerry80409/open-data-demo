package com.example.services.google.trends;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by jerry on 2017/2/7.
 */
public class DefaultHeaderInterceptor implements Interceptor {

    private final String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36";
    private final String referer = "https://www.google.com/trends/hottrends/visualize?ss=&pn=p";
    private final String origin = "https://www.google.com.tw";
    private final String applicationJson = "application/json;charset=utf-8";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request().newBuilder()
                .addHeader("Origin", origin)
                .addHeader("User-Agent", userAgent)
                .addHeader("Referer", referer)
                .addHeader("Content-Type", applicationJson)
                .build();
        return chain.proceed(request);
    }
}
