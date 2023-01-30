package com.secureapplication.auth.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipeid")
    private Long recipeId;

    @Column(name = "recipename")
    private String recipeName;

    @Column(name = "preptime")
    private String prepTime;

    @Column(name = "cooktime")
    private String cookTime;

    @Column(name = "servings")
    private String servings;

    @Column(name = "instructions")
    private String instructions;

    public Recipe() {
    }

    public Recipe(Long recipeId, String recipeName, String prepTime, String cookTime, String servings, String instructions) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.servings = servings;
        this.instructions = instructions;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public String getServings() {
        return servings;
    }

    public void setServings(String servings) {
        this.servings = servings;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

}
