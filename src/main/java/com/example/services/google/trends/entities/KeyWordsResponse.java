package com.example.services.google.trends.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 2017/2/7.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "romania",
        "finland",
        "portugal",
        "mexico",
        "egypt",
        "brazil",
        "united_states",
        "india",
        "malaysia",
        "austria",
        "colombia",
        "japan",
        "hungary",
        "taiwan",
        "greece",
        "czech_republic",
        "canada",
        "italy",
        "france",
        "kenya",
        "nigeria",
        "norway",
        "turkey",
        "israel",
        "australia",
        "singapore",
        "netherlands",
        "germany",
        "chile",
        "belgium",
        "thailand",
        "argentina",
        "spain",
        "south_korea",
        "ukraine",
        "hong_kong",
        "south_africa",
        "denmark",
        "poland",
        "indonesia",
        "russia",
        "sweden",
        "vietnam",
        "saudi_arabia",
        "switzerland",
        "philippines",
        "united_kingdom"
})
@Data
public class KeyWordsResponse {
    @JsonProperty("romania")
    private List<String> romania = null;
    @JsonProperty("finland")
    private List<String> finland = null;
    @JsonProperty("portugal")
    private List<String> portugal = null;
    @JsonProperty("mexico")
    private List<String> mexico = null;
    @JsonProperty("egypt")
    private List<String> egypt = null;
    @JsonProperty("brazil")
    private List<String> brazil = null;
    @JsonProperty("united_states")
    private List<String> unitedStates = null;
    @JsonProperty("india")
    private List<String> india = null;
    @JsonProperty("malaysia")
    private List<String> malaysia = null;
    @JsonProperty("austria")
    private List<String> austria = null;
    @JsonProperty("colombia")
    private List<String> colombia = null;
    @JsonProperty("japan")
    private List<String> japan = null;
    @JsonProperty("hungary")
    private List<String> hungary = null;
    @JsonProperty("taiwan")
    private List<String> taiwan = null;
    @JsonProperty("greece")
    private List<String> greece = null;
    @JsonProperty("czech_republic")
    private List<String> czechRepublic = null;
    @JsonProperty("canada")
    private List<String> canada = null;
    @JsonProperty("italy")
    private List<String> italy = null;
    @JsonProperty("france")
    private List<String> france = null;
    @JsonProperty("kenya")
    private List<String> kenya = null;
    @JsonProperty("nigeria")
    private List<String> nigeria = null;
    @JsonProperty("norway")
    private List<String> norway = null;
    @JsonProperty("turkey")
    private List<String> turkey = null;
    @JsonProperty("israel")
    private List<String> israel = null;
    @JsonProperty("australia")
    private List<String> australia = null;
    @JsonProperty("singapore")
    private List<String> singapore = null;
    @JsonProperty("netherlands")
    private List<String> netherlands = null;
    @JsonProperty("germany")
    private List<String> germany = null;
    @JsonProperty("chile")
    private List<String> chile = null;
    @JsonProperty("belgium")
    private List<String> belgium = null;
    @JsonProperty("thailand")
    private List<String> thailand = null;
    @JsonProperty("argentina")
    private List<String> argentina = null;
    @JsonProperty("spain")
    private List<String> spain = null;
    @JsonProperty("south_korea")
    private List<String> southKorea = null;
    @JsonProperty("ukraine")
    private List<String> ukraine = null;
    @JsonProperty("hong_kong")
    private List<String> hongKong = null;
    @JsonProperty("south_africa")
    private List<String> southAfrica = null;
    @JsonProperty("denmark")
    private List<String> denmark = null;
    @JsonProperty("poland")
    private List<String> poland = null;
    @JsonProperty("indonesia")
    private List<String> indonesia = null;
    @JsonProperty("russia")
    private List<String> russia = null;
    @JsonProperty("sweden")
    private List<String> sweden = null;
    @JsonProperty("vietnam")
    private List<String> vietnam = null;
    @JsonProperty("saudi_arabia")
    private List<String> saudiArabia = null;
    @JsonProperty("switzerland")
    private List<String> switzerland = null;
    @JsonProperty("philippines")
    private List<String> philippines = null;
    @JsonProperty("united_kingdom")
    private List<String> unitedKingdom = null;

    @JsonIgnore
    private List<String> additionalProperties = new ArrayList<>();

}
