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
        "3h"
})
@Data
public class Rain {
    @JsonProperty("3h")
    private Double _3h;
}
