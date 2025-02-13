package com.zosh.modal;

import lombok.Data;

import java.util.List;

@Data
public class Home {

    private List<HomeCategory> grid;

    private List<HomeCategory> shopByCategories;

    private List<HomeCategory> electronicCategories;

    private List<HomeCategory> dealsCategories;

    private List<Deal> deals;
}
