package com.example.laboratoriumwzorceprojektowe.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.laboratoriumwzorceprojektowe.R;
import com.example.laboratoriumwzorceprojektowe.entity.Recipe;
import com.example.laboratoriumwzorceprojektowe.presentation.RecipePresenter;
import com.example.laboratoriumwzorceprojektowe.presentation.RecipeView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements RecipeView {

    private RecipePresenter recipePresenter = new RecipePresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button refreshBTN = findViewById(R.id.refreshBTN);
//      CheckBox checkBox;

        recipePresenter.onAttach(this);

        refreshBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkBox);
                recipePresenter.refreshRecipes(checkBox.isChecked());
            }

        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        recipePresenter.onDetach();
    }


    @Override
    public void updateRecipes(List<Recipe> recipes) {
        TextView recipesView = findViewById(R.id.recipes);
        String text = "";
        for (Recipe recipe : recipes) {
            text += recipe.getPrzepis() + "\n";
            text += recipe.getOpis() + "\n";
            text += "\n";
        };
        recipesView.setText(text);
    }
}