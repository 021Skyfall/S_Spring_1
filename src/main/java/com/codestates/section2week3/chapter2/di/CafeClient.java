package com.codestates.section2week3.chapter2.di;

import com.codestates.section2week3.chapter2.di.Product.Coffee;

import java.util.List;

public class CafeClient {
    public static void main(String[] args) {
        MenuService menuService = new Coffee();
//        MenuService menuService = new Bread();
        MenuController menuController = new MenuController(menuService);
        List<Menu> menuList = menuController.getMenus();
    }
}
