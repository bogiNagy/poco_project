package com.codecool.enterprise.poco.services;

import com.codecool.enterprise.poco.model.recipes.Recipe;
import com.codecool.enterprise.poco.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    public void saveRecipe(Recipe recipe){

        recipeRepository.save(recipe);
    }

    public Recipe findRecipeById(Long id){

        return recipeRepository.findOne(id);
    }

    public Recipe findByTitle(String title){

        return recipeRepository.findRecipeByTitle(title);
    }


}
