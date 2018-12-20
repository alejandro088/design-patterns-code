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
public class NYStylePizzaStore extends ShopPizza4 {

    NYPizzaFactory factory;
    
    public NYStylePizzaStore() {
        
        this.factory = new NYPizzaFactory();
        
    }

    @Override
    public Pizza1 createPizza(String type) {
        
        pizza = factory.createPizza(type);
        
        return pizza;
    }
    
}
