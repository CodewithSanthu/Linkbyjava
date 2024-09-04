package com.example.Newpro.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
    
    @GetMapping("/search")
    public String search(@RequestParam("query") String query, @RequestParam("category") String category, Model model) {
        List<String> results = new ArrayList<>();

        
        if ("Books".equals(category)) {
            results.add("Java Programming Guide");
            results.add("Spring Boot in Action");
        } else if ("Movies".equals(category)) {
            results.add("Java: The Movie");
            results.add("Spring Boot: The Documentary");
        }

        model.addAttribute("query", query);
        model.addAttribute("category", category);
        model.addAttribute("results", results);

        return "Search"; 
    }
}
