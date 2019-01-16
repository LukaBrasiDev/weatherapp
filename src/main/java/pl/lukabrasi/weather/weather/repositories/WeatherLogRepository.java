package pl.lukabrasi.weather.weather.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukabrasi.weather.weather.entities.WeatherLogEntity;

@Repository
public interface WeatherLogRepository extends CrudRepository<WeatherLogEntity, Integer> {


}
