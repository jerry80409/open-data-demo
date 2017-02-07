package com.example.services.open.weather.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

/**
 * Created by jerry on 2017/2/7.
 */
@Data
@ConfigurationProperties(prefix = "open.weather")
public class WeatherPropertities {

    @NotNull
    private String key;
}
