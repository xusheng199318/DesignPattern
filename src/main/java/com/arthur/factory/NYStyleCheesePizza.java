package com.arthur.factory;

/**
 * Created by Arthur on 2018/1/8.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Saure";

        toppings.add("Grated Reggiano Cheese");
    }
}
