package com.codecool.enterprise.poco.controller;

import com.codecool.enterprise.poco.model.recipes.Recipe;
import com.codecool.enterprise.poco.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
    @Autowired
    RecipeService recipeService;

    @RequestMapping(value = "/index")
    public String indexPage(Model model) {
        Recipe recipe = recipeService.findRecipeById(1L);
        model.addAttribute("recipe", recipe);
        return "index";
    }
}
