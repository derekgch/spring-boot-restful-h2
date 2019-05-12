package com.sample.controller;

import com.sample.bean.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sample.service.ICityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ICityService cityService;

    @RequestMapping("/cities")
    public List<City> findCities() {
        
        return cityService.findAll();
    }

    @RequestMapping("/cities/{userId}")
    public City findCity(@PathVariable Long userId) {
        
        return cityService.findById(userId);
    }
}