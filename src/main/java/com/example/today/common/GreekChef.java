package com.example.today.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GreekChef implements Chef {

    public GreekChef() {
        System.out.println("French Chef: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "";
    }

    @Override
    public String arataNumeleRestaurantului() {
        return "";
    }

    @Override
    public String getChefName() {
        return "d";
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public String getMenuOfTheDay() {
        return "Meniul zilei grecesc.";
    }
}
