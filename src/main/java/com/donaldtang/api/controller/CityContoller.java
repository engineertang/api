package com.donaldtang.api.controller;

import com.donaldtang.api.springdata.domain.City;
import com.donaldtang.api.springdata.service.CityMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces = "application/json")
public class CityContoller {

    private final CityMapper cityMapper;

    public CityContoller(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    //@Bean
    CommandLineRunner sampleCommandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                City city = new City();
                city.setName("San Francisco");
                city.setState("CA");
                city.setCountry("US");
                cityMapper.insert(city);
                System.out.println(CityContoller.this.cityMapper.findById(city.getId()));
            }
        };
    }
}
