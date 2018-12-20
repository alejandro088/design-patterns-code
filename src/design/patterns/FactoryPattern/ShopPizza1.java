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
public class ShopPizza1 {

    private Pizza1 pizza;
    
    /**
     *
     * @return Pizza1
     */
    public Pizza1 orderPizza(String type) {
        
        /*
        *    Basándonos en el tipo de pizza, 
        *    creamos una instancia de la clase concreta correcta 
        *    y la asignamos a la variable de instancia de pizza. 
        *    Tenga en cuenta que cada pizza aquí tiene que implementar 
        *    la interfaz de Pizza
        */
        if (type.equals("cheese")) { 
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        /*
        *    Una vez que tengamos una pizza, la preparamos 
        *    (ya sabes, enrollamos la masa, ponemos la salsa y 
        *    añadimos las coberturas de queso), luego la horneamos, 
        *    la cortamos y la embalamos.
        *    Cada subtipo de pizza (CheesePizza, VeggiePizza, etc.)
        *    sabe cómo prepararse.
        */
        return pizza;

    }
    
}
