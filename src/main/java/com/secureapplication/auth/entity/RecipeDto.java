package com.secureapplication.auth.entity;

import java.util.List;

public class RecipeDto {
    private final Recipe recipe;
    private final List<Ingredient> ingredients;

    public RecipeDto(Recipe recipe, List<Ingredient> ingredients) {
        this.recipe = recipe;
        this.ingredients = ingredients;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}

