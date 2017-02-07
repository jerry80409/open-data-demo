package com.example.services.open.weather;

import com.example.services.open.weather.entities.OpenWeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jerry on 2017/2/7.
 */
public interface OpenWeatherMapService {

    /**
     * E.g. id=2172797
     * @see <a href="http://bulk.openweathermap.org/sample/">http://bulk.openweathermap.org/sample/</a>
     * @return
     */
    @GET("weather")
    Call<OpenWeatherResponse> currentWeatherByCityId(@Query("id") String cityId);

    /**
     * E.g. q=London, or q=London,uk
     * @param location
     * @return
     */
    @GET("weather")
    Call<OpenWeatherResponse> currentWeatherByCityName(@Query("q") String location);

    /**
     * E.g. lat=35&long139
     * @param latitude
     * @param longitude
     * @return
     */
    @GET("weather")
    Call<OpenWeatherResponse> currentWeatherByGeographicCoordinates(@Query("lat") String latitude,
                                                                      @Query("lon") String longitude);
}
