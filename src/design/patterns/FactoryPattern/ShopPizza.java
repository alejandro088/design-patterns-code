/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public class ShopPizza {
    
    /**
     *
     * @return Pizza
     */
    public Pizza orderPizza() { 
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
}
