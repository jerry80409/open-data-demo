package com.example.service.open.weather;

import com.example.services.open.weather.OpenWeatherMapService;
import com.example.services.open.weather.entities.OpenWeatherResponse;
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
        Response<OpenWeatherResponse> response =
                openWeatherMapService.currentWeatherByCityName("Taipei").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testCurrentWeatherByCityId() throws IOException {
        Response<OpenWeatherResponse> response =
                openWeatherMapService.currentWeatherByCityId("1668341").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }

    @Test
    public void testCurrentWeatherByGeographicCoordinates() throws IOException {
        Response<OpenWeatherResponse> response =
                openWeatherMapService.currentWeatherByGeographicCoordinates("35", "139").execute();
        System.out.println(response.body());
        Assert.assertEquals(200, response.code());
    }
}
