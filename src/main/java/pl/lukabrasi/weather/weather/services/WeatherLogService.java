package pl.lukabrasi.weather.weather.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukabrasi.weather.weather.entities.WeatherLogEntity;
import pl.lukabrasi.weather.weather.repositories.WeatherLogRepository;

@Service
public class WeatherLogService {

    final WeatherLogRepository weatherLogRepository;
    @Autowired
    public WeatherLogService(WeatherLogRepository weatherLogRepository) {
        this.weatherLogRepository = weatherLogRepository;
    }



    public boolean saveWeatherLog(WeatherForm weatherForm){
        return weatherLogRepository.save(new WeatherLogEntity(weatherForm)) != null;
    }
}
