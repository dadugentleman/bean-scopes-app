package com.example.today.rest;

import com.example.today.common.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/dailyrecipe")
    public String dailyRecipe() {

        return myChef.getDailyRecipe();

    }

    @GetMapping("/restname")
    public String restName() {

        return myChef.arataNumeleRestaurantului();

    }

    @GetMapping("/abcd")
    public String cName() {
        return myChef.getChefName();
    }

    @GetMapping("/salary")
    public double getSalary() {
        return myChef.getSalary();
    }

    @GetMapping("/menu")
    public String getMenu() {
        return myChef.getMenuOfTheDay();
    }

    private Chef myChef;
    private Chef secondChef;

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myChef == secondChef, " + (myChef == secondChef);
    }

    //Constructor
    @Autowired
    public DemoController(@Qualifier("moldovanChef") Chef theChef,
                          @Qualifier("moldovanChef") Chef theSecondChef) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myChef = theChef;
        secondChef = theSecondChef;
    }


}
