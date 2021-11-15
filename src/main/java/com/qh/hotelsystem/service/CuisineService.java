package com.qh.hotelsystem.service;

import com.qh.hotelsystem.bean.Cuisine;

import java.util.List;

public interface CuisineService {
    List<Cuisine> LoadCuisineService();
    int DeleteCuisineService(Integer id);
    int insertCuisineService(Cuisine cuisine);
}
