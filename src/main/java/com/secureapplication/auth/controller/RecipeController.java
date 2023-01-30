package com.secureapplication.auth.controller;

import com.secureapplication.auth.entity.Ingredient;
import com.secureapplication.auth.entity.Recipe;
import com.secureapplication.auth.entity.RecipeDto;
import com.secureapplication.auth.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/getRecipe")
    public ResponseEntity<RecipeDto> getRecipe(@RequestParam(value = "name") String recipeName) {
        Recipe recipe = recipeService.getRecipe(recipeName);
        if (recipe != null) {
            List<Ingredient> ingredients = recipeService.getIngredientsByRecipe(recipe);
               RecipeDto recipeDto = new RecipeDto(recipe, ingredients);
            return new ResponseEntity<>(recipeDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    //get all recipes
    @GetMapping("/getAllRecipes")
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        if (recipes != null) {
            return new ResponseEntity<>(recipes, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    //delete recipe by id
    @DeleteMapping("/deleteRecipe/{id}")
    public ResponseEntity<?> deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
