package com.qh.hotelsystem.dao;

import com.qh.hotelsystem.bean.Food;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FoodDao {
    @Insert("insert into food(id,foodname,cuisinename,price,memberprice,introduce) values(#{id},#{foodname},#{cuisinename},#{price},#{memberprice},#{introduce})")
    int insertFoodDao(Food food);
    @Select("select * from food")
    List<Food> LoadFoodDao();
    @Delete("delete from food where id=#{id}")
    int deleteFoodDao(Integer id);
}
