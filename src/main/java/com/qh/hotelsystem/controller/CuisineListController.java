package com.qh.hotelsystem.controller;


import com.qh.hotelsystem.bean.Cuisine;
import com.qh.hotelsystem.service.CuisineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CuisineListController {

    @Autowired CuisineService cuisineService;

    @GetMapping("cuisineLoad")
    public List<Cuisine> cuisineLoad(){
        List<Cuisine> cuisines =cuisineService.LoadCuisineService() ;
        return cuisines;
    }

    @GetMapping("deleteCuisine")
    public ModelAndView cuisineDelete(Integer id){
        ModelAndView mv=new ModelAndView();
        int nums=cuisineService.DeleteCuisineService(id);
        mv.addObject("tips");
        mv.setViewName("detail/cuisineList");
        return mv;
    }

    @GetMapping("/saveCuisine")
    public ModelAndView left_saveCuisine(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("detail/saveCuisine");
        return mv;
    }

    @PostMapping("insertcuisine")
    public ModelAndView left_insertCuisine(Cuisine cuisine){
        ModelAndView mv=new ModelAndView();
        int nums=cuisineService.insertCuisineService(cuisine);
        //System.out.println(cuisine);
        mv.addObject(nums);
        mv.setViewName("detail/cuisineList");
        return mv;
    }

    @GetMapping("/updateCuisine")
    public ModelAndView left_updateCuisine(Integer id,String cuisinename){
        ModelAndView mv=new ModelAndView();
        cuisineService.DeleteCuisineService(id);
        mv.addObject("updateid",id);
        mv.addObject("updatename",cuisinename);
        mv.setViewName("detail/updateCuisine");
        return mv;
    }

}
