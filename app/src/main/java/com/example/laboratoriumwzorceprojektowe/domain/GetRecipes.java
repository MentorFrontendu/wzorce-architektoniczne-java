package com.example.laboratoriumwzorceprojektowe.domain;

import com.example.laboratoriumwzorceprojektowe.entity.Recipe;
import com.example.laboratoriumwzorceprojektowe.repository.RecipeRepository;

import java.util.ArrayList;
import java.util.List;

public class GetRecipes {

    private RecipeRepository recipeRepository;

    // konstruktor
    public GetRecipes(){
        recipeRepository = new RecipeRepository();
    }

    // metoda
    public List<Recipe> getRecipes(boolean isWithMeat){
        List<Recipe>  allRecipes = recipeRepository.getRecipes();
        List<Recipe> filteredRecipes = new ArrayList<Recipe>(3);

        for (Recipe recipe: allRecipes) {
            if (recipe.isCzyJestMiesny() && isWithMeat) {
                filteredRecipes.add(recipe);
            }else if(!recipe.isCzyJestMiesny() && !isWithMeat){
                filteredRecipes.add(recipe);
            }

        };
        return filteredRecipes;
    }
}

// done !!!