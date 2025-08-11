package com.example.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to eShop Home!");
        return "home";
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        // Dùng lại danh sách sản phẩm mẫu
        List<Map<String, Object>> products = new ArrayList<>();
        products.add(Map.of(
                "name", "CK IN2U Her",
                "brand", "Calvin Klein",
                "price", "$17.00",
                "image", "https://via.placeholder.com/90x120?text=CK+IN2U+Her"));
        products.add(Map.of(
                "name", "Mr. Burberry",
                "brand", "Burberry",
                "price", "$20.00",
                "image", "https://via.placeholder.com/90x120?text=Mr+Burberry"));
        products.add(Map.of(
                "name", "CK One Shock for Him",
                "brand", "Calvin Klein",
                "price", "$21.00",
                "image", "https://via.placeholder.com/90x120?text=CK+One+Shock"));
        products.add(Map.of(
                "name", "Hugo Man",
                "brand", "Hugo Boss",
                "price", "$21.00",
                "image", "https://via.placeholder.com/90x120?text=Hugo+Man"));
        model.addAttribute("products", products);
        return "listProduct";
    }

}
