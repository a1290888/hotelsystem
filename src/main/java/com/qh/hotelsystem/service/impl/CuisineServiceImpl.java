package com.qh.hotelsystem.service.impl;

import com.qh.hotelsystem.bean.Cuisine;
import com.qh.hotelsystem.dao.CuisineDao;
import com.qh.hotelsystem.service.CuisineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuisineServiceImpl implements CuisineService {

    @Autowired
    private CuisineDao cuisineDao;

    @Override
    public List<Cuisine> LoadCuisineService() {
        return cuisineDao.LoadCuisineDao();
    }

    @Override
    public int DeleteCuisineService(Integer id) {
        int nums=cuisineDao.deleteCuisineDao(id);
        return nums;
    }

    @Override
    public int insertCuisineService(Cuisine cuisine) {
        int nums=cuisineDao.insertCuisineDao(cuisine);
        return nums;
    }
}
