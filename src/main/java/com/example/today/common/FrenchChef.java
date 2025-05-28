package com.example.today.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {


    public FrenchChef() {
        System.out.println("French Chef: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Preparez un boeuf bourgignon aved des legumes ./.. ";
    }

    @Override
    public String arataNumeleRestaurantului() {
        return "Nume Restaurant Francez";
    }

    @Override
    public String getChefName() {
        return "bla bal bla en franacais ";
    }

    @Override
    public double getSalary() {
        return 1000;
    }

    @Override
    public String getMenuOfTheDay() {
        return "";
    }


}
