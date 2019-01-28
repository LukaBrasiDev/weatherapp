package pl.lukabrasi.weather.weather.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherDto {

    TemperatureDto main;
CloudsDto clouds;

    @Data
    public static class TemperatureDto {

        private double temp;
        private double pressure;


    }

    @Data
    public static class CloudsDto{
        @JsonProperty(value="all")
        private int clouds;
    }


}
