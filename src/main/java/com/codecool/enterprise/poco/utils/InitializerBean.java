package com.codecool.enterprise.poco.utils;

import com.codecool.enterprise.poco.model.recipes.Recipe;
import com.codecool.enterprise.poco.services.RecipeService;
import org.springframework.stereotype.Component;

@Component
public class InitializerBean {
    public InitializerBean(RecipeService recipeService){
        Recipe recipe = new Recipe("Lecsó", "paprika, paradicsom, hagyma");
        recipeService.saveRecipe(recipe);
    }
}
