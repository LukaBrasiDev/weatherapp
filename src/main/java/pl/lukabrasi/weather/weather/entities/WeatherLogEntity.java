package pl.lukabrasi.weather.weather.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "weatjer_log")
public class WeatherLogEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "city_name")
    private String cityName;

    @Column (name = "city_temp")
    private String cityTemp;

    @Column (name = "timestamp")
    private float timestamp;



}
