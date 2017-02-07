package com.example.services.open.weather.entities.forecast.weather;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

/**
 * Created by jerry on 2017/2/7.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speed",
        "deg"
})
@Data
public class Wind {
    @JsonProperty("speed")
    private Double speed;
    @JsonProperty("deg")
    private Double deg;
}
