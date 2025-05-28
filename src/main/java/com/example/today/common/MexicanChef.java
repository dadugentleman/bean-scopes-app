package com.example.today.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MexicanChef implements Chef {

    public MexicanChef() {
        System.out.println("French Chef: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepara tacos al pastor con pina, cilangtro y salsa ...";
    }

    @Override
    public String arataNumeleRestaurantului() {
        return "Nume Restaurant Mexican";
    }

    @Override
    public String getChefName() {
        return "Pablo";
    }

    @Override
    public double getSalary() {
        return 3000;
    }

    @Override
    public String getMenuOfTheDay() {
        return "";
    }
}
