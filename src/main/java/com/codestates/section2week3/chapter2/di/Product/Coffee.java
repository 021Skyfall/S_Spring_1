package com.codestates.section2week3.chapter2.di.Product;

import com.codestates.section2week3.chapter2.di.Menu;
import com.codestates.section2week3.chapter2.di.MenuService;

import java.util.List;

public class Coffee implements MenuService {

    @Override
    public List<Menu> getMenuList() {
        return List.of(
                new Menu(1, "아메리카노", 3000),
                new Menu(2, "콜드브루", 5000),
                new Menu(3, "카페라떼", 4500)
        );
    }
}