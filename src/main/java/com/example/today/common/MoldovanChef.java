package com.example.today.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MoldovanChef implements Chef {

    public MoldovanChef() {
        System.out.println("French Chef: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Reteta moldoveneasca a zilei.";
    }

    @Override
    public String arataNumeleRestaurantului() {
        return "Nume Restaurant Moldovenesc";
    }

    @Override
    public String getChefName() {
        return "Alexandru Comerzan";
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
