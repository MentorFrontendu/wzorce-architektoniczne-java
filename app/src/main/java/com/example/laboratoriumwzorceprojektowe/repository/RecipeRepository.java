package com.example.laboratoriumwzorceprojektowe.repository;

import com.example.laboratoriumwzorceprojektowe.entity.Recipe;
import com.example.laboratoriumwzorceprojektowe.storage.RecipeStorage;

import java.util.List;

public class RecipeRepository {

    private RecipeStorage recipeStorage;

    public RecipeRepository(){
        recipeStorage = new RecipeStorage();
    }

    public List<Recipe> getRecipes(){
        return recipeStorage.lisaPrzepiswow;
    }
}
