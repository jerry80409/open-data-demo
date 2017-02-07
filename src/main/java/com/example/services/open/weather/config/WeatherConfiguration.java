package com.example.services.open.weather.config;

import com.example.services.open.weather.OpenWeatherMapService;
import com.example.services.open.weather.WeatherBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

/**
 * Created by jerry on 2017/2/7.
 */
@Configuration
@EnableConfigurationProperties(WeatherPropertities.class)
public class WeatherConfiguration {

    @Inject
    private WeatherPropertities weatherPropertities;

    @Bean
    public OpenWeatherMapService openWeatherMapService() {
        return WeatherBuilder.create(weatherPropertities.getKey()).build();
    }
}
