package com.example.today.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {


    public ItalianChef() {
        System.out.println("French Chef: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pomodoro " +
                "with fresh tomatoes and basil!";

    }

    @Override
    public String arataNumeleRestaurantului() {
        return "Nume Restaurant Italian";
    }

    @Override
    public String getChefName() {
        return "";
    }

    @Override
    public double getSalary() {
        return 2000;
    }

    @Override
    public String getMenuOfTheDay() {
        return "";
    }

}
