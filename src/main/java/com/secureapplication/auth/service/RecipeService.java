package com.secureapplication.auth.service;

import com.secureapplication.auth.entity.Ingredient;
import com.secureapplication.auth.entity.Recipe;
import com.secureapplication.auth.repository.IngredientRepository;
import com.secureapplication.auth.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    private final IngredientRepository ingredientRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {
        this.recipeRepository = recipeRepository;
        this.ingredientRepository = ingredientRepository;
    }

    public Recipe getRecipe(String recipeName) {
        return recipeRepository.findByRecipeName(recipeName);
    }

    public List<Ingredient> getIngredientsByRecipe(Recipe recipe) {
        return ingredientRepository.findByRecipe(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    //delete recipe by id
    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }
}
