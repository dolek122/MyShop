package com.arekproject.MyShop.controller;

import com.arekproject.MyShop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class HomeController {
    List<Item> items = List.of(
            new Item("Laptop", new BigDecimal("3000"), "https://gfx.senetic.com/i/gallery/91316572_9032439463.jpg");
    )
    @GetMapping("/")
    public String home(Model model) {
        model.addAllAttributes("items", items);
        return "home";
    }

}
