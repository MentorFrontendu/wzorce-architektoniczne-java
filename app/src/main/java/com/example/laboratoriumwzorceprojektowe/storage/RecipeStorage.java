package com.example.laboratoriumwzorceprojektowe.storage;

import com.example.laboratoriumwzorceprojektowe.entity.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeStorage {

    public  List<Recipe> lisaPrzepiswow;

    public  RecipeStorage(){
        lisaPrzepiswow = new ArrayList<Recipe>(6);

        Recipe r1 = new Recipe("Gulasz","Węgierskie danie narodowe, które składa się z mięsa, cebuli i papryki. Nazwa pörkölt wywodzi się od dawnego węgierskiego słowa pergelt, co dziś oznacza przypieczony, przyrumieniony.",true);
        Recipe r2 = new Recipe("Bigos","Tradycyjna dla kuchni polskiej, litewskiej i białoruskiej potrawa z kapusty i mięsa",true);
        Recipe r3 = new Recipe("Leczo","Węgierska potrawa znana także w Polsce, Czechach, na Słowacji, Ukrainie, w Niemczech, Austrii i Izraelu, rodzaj ragoût warzywnego z pomidorów i świeżej papryki duszonych na smalcu z dodatkiem wędzonej słoniny i z podsmażoną na złocisty kolor cebulą, doprawionych papryką w proszku.",true);

        Recipe r4 = new Recipe("Pierogi ruskie","Popularny w Polsce i na Ukrainie rodzaj pierogów, których nazwa wywodzi się od Rusi Czerwonej. Nie należy jej mylić, jak to często jest robione, z Rosją, gdzie ten typ pierogów nie jest zbyt dobrze znany, ponieważ były bardzo popularne wśród Polaków mieszkających na terenach Rusi.",false);
        Recipe r5 = new Recipe("Gnocchi","Pyszne kluseczki włoskie, które łudząco przypominają wyglądem i smakiem nasze polskie kopytka.",false);
        Recipe r6 = new Recipe("Knedle","Danie z gotowanych knedli ziemniaczanych ze śliwkami lub morelami, popularne w krajach Europy Środkowo-Wschodniej, zwłaszcza w Polsce, na Węgrzech, w Serbii, Chorwacji, Bośni i Hercegowinie, Rumunii, Słowacji i Czechach. Danie jest spożywane jako deser, danie główne lub dodatek.",false);

        lisaPrzepiswow.add(r1);
        lisaPrzepiswow.add(r2);
        lisaPrzepiswow.add(r3);
        lisaPrzepiswow.add(r4);
        lisaPrzepiswow.add(r5);
        lisaPrzepiswow.add(r6);
    }
}
