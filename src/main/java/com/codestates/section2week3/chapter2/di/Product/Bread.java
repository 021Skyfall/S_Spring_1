package com.codestates.section2week3.chapter2.di.Product;

import com.codestates.section2week3.chapter2.di.Menu;
import com.codestates.section2week3.chapter2.di.MenuService;

import java.util.List;

public class Bread implements MenuService {
    @Override
    public List<Menu> getMenuList() {
        return List.of(
                new Menu(1, "소보로", 2500),
                new Menu(2, "단팥빵",2000),
                new Menu(3, "커피번",3000)
        );
    }
}
