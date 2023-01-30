package com.secureapplication.auth.repository;

import com.secureapplication.auth.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    Recipe findByRecipeName(String recipeName);
}
