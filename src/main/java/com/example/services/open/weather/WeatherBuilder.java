package com.example.services.open.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by jerry on 2017/2/7.
 */
public class WeatherBuilder {
    public static final String DEFAULT_API_END_POINT = "http://api.openweathermap.org/data/2.5/";

    private String apiEndPoint = DEFAULT_API_END_POINT;
    private long connectTimeout = 10_000;
    private long readTimeout  = 10_000;
    private long writeTimeout = 10_000;

    private List<Interceptor> interceptors = new ArrayList<>();
    private OkHttpClient.Builder okHttpClientBuilder;
    private Retrofit.Builder retrofitBuilder;

    /**
     * Construct
     *
     * @param interceptors
     */
    public WeatherBuilder(List<Interceptor> interceptors) {
        this.interceptors.addAll(interceptors);
    }

    /**
     * create WeatherBuilder Instance
     *
     * @param key open-weather-map api key
     * @return {@link WeatherBuilder}
     */
    public static WeatherBuilder create(String key) {
        return new WeatherBuilder(defaultInterceptor(key));
    }

    /**
     * @param key open-weather-map api key
     * @return List of Interceptor
     */
    private static List<Interceptor> defaultInterceptor(String key) {
        final Logger slf4jLogger = LoggerFactory.getLogger("com.example");
        final HttpLoggingInterceptor httpLoggingInterceptor =
                new HttpLoggingInterceptor(message -> slf4jLogger.info("{}", message));
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return Arrays.asList(
                httpLoggingInterceptor,
                new DefaultQueryInterceptor(key)
        );
    }

    private static Retrofit.Builder createDefaultRetrofitBuilder() {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // Register Joda Module and read number as millsec.
        objectMapper.registerModule(new JodaModule())
                .configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS, false);

        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create(objectMapper));
    }

    /**
     * Creates a new {@link WeatherBuilder}.
     */
    public OpenWeatherMapService build() {
        if (okHttpClientBuilder == null) {
            okHttpClientBuilder = new OkHttpClient.Builder();
            interceptors.forEach(okHttpClientBuilder::addInterceptor);
        }
        okHttpClientBuilder
                .connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
                .readTimeout(readTimeout, TimeUnit.MILLISECONDS)
                .writeTimeout(writeTimeout, TimeUnit.MILLISECONDS);
        final OkHttpClient okHttpClient = okHttpClientBuilder.build();

        if (retrofitBuilder == null) {
            retrofitBuilder = createDefaultRetrofitBuilder();
        }
        retrofitBuilder.client(okHttpClient);
        retrofitBuilder.baseUrl(apiEndPoint);
        final Retrofit retrofit = retrofitBuilder.build();

        return retrofit.create(OpenWeatherMapService.class);
    }
}
