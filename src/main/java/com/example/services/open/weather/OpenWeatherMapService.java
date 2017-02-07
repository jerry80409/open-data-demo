package com.example.services.open.weather;

import com.example.services.open.weather.entities.current.weather.CurrentWeatherResponse;
import com.example.services.open.weather.entities.forecast.weather.ForecastWeatherResponse;
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
    Call<CurrentWeatherResponse> currentWeatherByCityId(@Query("id") String cityId);

    /**
     * E.g. q=London, or q=London,uk
     * @param location
     * @return
     */
    @GET("weather")
    Call<CurrentWeatherResponse> currentWeatherByCityName(@Query("q") String location);

    /**
     * E.g. lat=35&long139
     * @param latitude
     * @param longitude
     * @return
     */
    @GET("weather")
    Call<CurrentWeatherResponse> currentWeatherByGeographicCoordinates(@Query("lat") String latitude,
                                                                       @Query("lon") String longitude);

    /**
     * E.g. zip=94040,us
     * @param zipCode
     * @return
     */
    @GET("weather")
    Call<CurrentWeatherResponse> currentWeatherByZipCode(@Query("zip") String zipCode);

    /**
     * E.g. id=524901,703448,2643743
     * @param ids
     * @return
     */
    @GET("group")
    Call<CurrentWeatherResponse> currentWeatherBySeveralCityIds(@Query("id") String ids);

    /**
     * E.g. q=London,us
     * @param city
     * @return
     */
    @GET("forecast")
    Call<ForecastWeatherResponse> forecastFiveDaysWeatherByCityName(@Query("q") String city);

    /**
     * E.g. id=524901
     * @param id
     * @return
     */
    @GET("forecast")
    Call<ForecastWeatherResponse> forecastFiveDaysWeatherByCityId(@Query("id") String id);

    /**
     * E.g. lat=35&lon=139
     * @param latitude
     * @param  longitude
     * @return
     */
    @GET("forecast")
    Call<ForecastWeatherResponse> forecastFiveDaysWeatherByGeographicCoordinates(@Query("lat") String latitude,
                                                                                @Query("lon") String longitude);
}
