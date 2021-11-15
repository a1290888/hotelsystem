package com.qh.hotelsystem.service;


import com.qh.hotelsystem.bean.Food;

import java.util.List;

public interface FoodService {
    int insertFoodService(Food food);
    List<Food> LoadFoodService();
    int DeleteFoodService(Integer id);
}
