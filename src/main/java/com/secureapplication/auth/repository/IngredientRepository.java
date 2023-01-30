package com.secureapplication.auth.repository;

import com.secureapplication.auth.entity.Ingredient;
import com.secureapplication.auth.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findByRecipe(Recipe recipe);
}

