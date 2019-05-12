package com.sample.service;

import com.sample.bean.City;
import java.util.List;

public interface ICityService {

    public List<City> findAll();
    public City findById(Long id);
}