package com.codecool.enterprise.poco.repository;

import com.codecool.enterprise.poco.model.recipes.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
    Recipe findRecipeByTitle(String title);
}
