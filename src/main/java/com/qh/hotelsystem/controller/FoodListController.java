package com.qh.hotelsystem.controller;

import com.qh.hotelsystem.bean.Cuisine;
import com.qh.hotelsystem.bean.Food;
import com.qh.hotelsystem.service.CuisineService;
import com.qh.hotelsystem.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class FoodListController {

    @Autowired
    CuisineService cuisineService;

    @Autowired
    FoodService foodService;

    @GetMapping("cuisinenameLoad")
    public List<Cuisine> cuisineLoad(){
        List<Cuisine> cuisines =cuisineService.LoadCuisineService() ;
        return cuisines;
    }

    @GetMapping("/saveFood")
    public ModelAndView left_saveFood(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("detail/saveFood");
        return mv;
    }

    @PostMapping("insertFood")
    public ModelAndView left_insertFood(Food food){
        ModelAndView mv=new ModelAndView();
        System.out.println(food);
        foodService.insertFoodService(food);
        mv.setViewName("detail/foodList");
        return mv;
    }

    @GetMapping("foodLoad")
    public List<Food> foodLoad(){
        List<Food> foods =foodService.LoadFoodService();
        return foods;
    }

    @GetMapping("deleteFood")
    public ModelAndView foodDelete(Integer id){
        ModelAndView mv=new ModelAndView();
        int nums=foodService.DeleteFoodService(id);
        mv.setViewName("detail/foodList");
        return mv;
    }

    @GetMapping("updateFood")
    public ModelAndView updateFood(Integer id,String foodname,String cuisinename,Integer price,String memberprice,String introduce){
        ModelAndView mv=new ModelAndView();
        foodService.DeleteFoodService(id);
        mv.addObject("updateId",id);
        mv.addObject("updateFoodname",foodname);
        mv.addObject("updateCuisinename",cuisinename);
        mv.addObject("updatePrice",price);
        mv.addObject("updateMemberprice",memberprice);
        mv.addObject("updateIntroduce",introduce);
        mv.setViewName("detail/updateFood");
        return mv;
    }
}
