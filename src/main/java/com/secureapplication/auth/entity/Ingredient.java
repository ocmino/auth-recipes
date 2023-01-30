package com.secureapplication.auth.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredientid")
    private Long ingredientId;

    @Column(name = "ingredientname")
    private String ingredientName;

    @Column(name = "quantity")
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "recipeid")
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(Long ingredientId, String ingredientName, String quantity, Recipe recipe) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
        this.quantity = quantity;
        this.recipe = recipe;
    }

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}