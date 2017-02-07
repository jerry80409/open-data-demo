package com.example.services.open.weather.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by jerry on 2017/2/7.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speed",
        "deg"
})
public class Wind {
    @JsonProperty("speed")
    private Double speed;
    @JsonProperty("deg")
    private Integer deg;
}
