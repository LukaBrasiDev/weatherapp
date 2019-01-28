package pl.lukabrasi.weather.weather.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.lukabrasi.weather.weather.dtos.WeatherDto;
import pl.lukabrasi.weather.weather.entities.WeatherLogEntity;
import pl.lukabrasi.weather.weather.repositories.WeatherLogRepository;

@Service
public class WeatherLogService {

    @Value("${api.openweathermap.key}")
    String apiKey;

    final WeatherLogRepository weatherLogRepository;

    @Autowired
    public WeatherLogService(WeatherLogRepository weatherLogRepository) {
        this.weatherLogRepository = weatherLogRepository;
    }



/*    public boolean saveWeatherLog(WeatherForm weatherForm){
        return weatherLogRepository.save(new WeatherLogEntity(weatherForm)) != null;
    }*/

    public WeatherDto getWeather(String cityName) {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&units=metric&appid="+apiKey,WeatherDto.class);

    }

    public WeatherDto getPressure(String cityName) {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&units=metric&appid="+apiKey,WeatherDto.class);

    }

    public WeatherDto getClouds(String cityName) {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&units=metric&appid="+apiKey,WeatherDto.class);

    }
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
