package com.example.services.open.weather;

import com.example.services.open.weather.entities.current.weather.CurrentWeatherResponse;
import com.example.services.open.weather.entities.forecast.weather.ForecastWeatherResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Response;

import java.io.IOException;
import javax.inject.Inject;

/**
 * Created by jerry on 2017/2/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OpenWeatherMapServiceTest {

    @Inject
    private OpenWeatherMapService openWeatherMapService;

    @Test
    public void testCurrentWeatherByCityName() throws IOException {
        Response<CurrentWeatherResponse> response =
                openWeatherMapService.currentWeatherByCityName("Taipei").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testCurrentWeatherByCityId() throws IOException {
        Response<CurrentWeatherResponse> response =
                openWeatherMapService.currentWeatherByCityId("1668341").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testCurrentWeatherByGeographicCoordinates() throws IOException {
        Response<CurrentWeatherResponse> response =
                openWeatherMapService.currentWeatherByGeographicCoordinates("25.05", "121.53").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testCurrentWeatherByZipCode() throws IOException {
        Response<CurrentWeatherResponse> response =
                openWeatherMapService.currentWeatherByZipCode("94040,us").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testCurrentWeatherBySeveralCityIds() throws IOException {
        Response<CurrentWeatherResponse> response =
                openWeatherMapService.currentWeatherBySeveralCityIds("524901,703448,2643743").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testForecastFiveDaysWeatherByCityName() throws IOException {
        Response<ForecastWeatherResponse> response =
                openWeatherMapService.forecastFiveDaysWeatherByCityName("Taipei").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testForecastFiveDaysWeatherByCityId() throws IOException {
        Response<ForecastWeatherResponse> response =
                openWeatherMapService.forecastFiveDaysWeatherByCityId("1668341").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testForecastFiveDaysWeatherByGeographicCoordinates() throws IOException {
        Response<ForecastWeatherResponse> response =
                openWeatherMapService.forecastFiveDaysWeatherByGeographicCoordinates("25.05", "121.53").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }
}
