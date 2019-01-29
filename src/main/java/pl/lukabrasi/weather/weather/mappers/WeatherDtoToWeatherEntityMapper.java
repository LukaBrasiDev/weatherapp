package pl.lukabrasi.weather.weather.mappers;

import pl.lukabrasi.weather.weather.dtos.WeatherDto;
import pl.lukabrasi.weather.weather.entities.WeatherLogEntity;

import java.time.LocalDateTime;

public class WeatherDtoToWeatherEntityMapper {


    public static WeatherLogEntity convert(WeatherDto weatherDto){
        WeatherLogEntity weatherLogEntity = new WeatherLogEntity();
        weatherLogEntity.setCityName(weatherDto.getCityName());
        weatherLogEntity.setQueryTime(LocalDateTime.now());
        weatherLogEntity.setCityTemp(weatherDto.getMain().getTemp());
        return weatherLogEntity;
    }
}
