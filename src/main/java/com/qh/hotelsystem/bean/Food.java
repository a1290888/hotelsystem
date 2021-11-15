package com.qh.hotelsystem.bean;

import lombok.Data;

@Data
public class Food {
    private Integer id;
    private String foodname;
    private String cuisinename;
    private Integer price;
    private Integer memberprice;
    private String introduce;
}
