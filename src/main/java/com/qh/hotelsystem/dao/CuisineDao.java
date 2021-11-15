package com.qh.hotelsystem.dao;

import com.qh.hotelsystem.bean.Cuisine;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CuisineDao {
    @Select("select * from cuisine")
    List<Cuisine> LoadCuisineDao();
    @Delete("delete from cuisine where id=#{id}")
    int deleteCuisineDao(Integer id);
    @Insert("insert into cuisine(id,cuisinename) values(#{id},#{cuisinename})")
    int insertCuisineDao(Cuisine cuisine);
}
