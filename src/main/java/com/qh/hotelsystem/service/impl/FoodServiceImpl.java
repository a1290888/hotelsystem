package com.qh.hotelsystem.service.impl;

import com.qh.hotelsystem.bean.Food;
import com.qh.hotelsystem.dao.FoodDao;
import com.qh.hotelsystem.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDao foodDao;



    @Override
    public int insertFoodService(Food food) {
        int num=foodDao.insertFoodDao(food);
        return num;
    }

    @Override
    public List<Food> LoadFoodService() {
        return foodDao.LoadFoodDao();
    }

    @Override
    public int DeleteFoodService(Integer id) {
        int nums=foodDao.deleteFoodDao(id);
        return nums;
    }
}
