package com.example.laboratoriumwzorceprojektowe.presentation;

import android.util.Log;

import com.example.laboratoriumwzorceprojektowe.domain.GetRecipes;
import com.example.laboratoriumwzorceprojektowe.entity.Recipe;

import java.util.List;

public class RecipePresenter {

    private GetRecipes getRecipes;
    private RecipeView recipeView = null;

    public RecipePresenter(){
        getRecipes = new GetRecipes();
    }

    public void onAttach (RecipeView recipeView) {
        this.recipeView = recipeView;
    }

    public void  onDetach() {
        this.recipeView = null;
    }

    public void refreshRecipes(boolean isWithMeat){
        if(recipeView != null){
            recipeView.updateRecipes(getRecipes.getRecipes(isWithMeat));
        }
    }

}
