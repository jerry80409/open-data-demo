package com.example.services.google.trends.config;

import com.example.services.google.trends.GoogleTrendsBuilder;
import com.example.services.google.trends.GoogleTrendsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jerry on 2017/2/7.
 */
@Configuration
public class GoogleTrendsConfiguration {

    @Bean
    public GoogleTrendsService googleTrendsService() {
        return GoogleTrendsBuilder.create().build();
    }
}
