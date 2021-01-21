package com.example.laboratoriumwzorceprojektowe.entity;

public class Recipe {
    private String przepis;
    private String opis;
    private boolean czyJestMiesny;

    public Recipe(String przepis, String opis, boolean czyJestMiesny){
        this.przepis = przepis;
        this.opis = opis;
        this.czyJestMiesny = czyJestMiesny;
    }

    public String getPrzepis() {
        return przepis;
    }

    public String getOpis() {
        return opis;
    }

    public boolean isCzyJestMiesny() {
        return czyJestMiesny;
    }

}
