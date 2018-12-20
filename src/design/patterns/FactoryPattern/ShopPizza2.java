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
public class ShopPizza2 {

    private Pizza1 pizza;
    
    /**
     *
     * @return Pizza1
     */
    public Pizza1 orderPizza(String type) {
        
        /**
        * Esto es lo que varía. A medida que la selección de pizza 
        * cambia con el tiempo, debe modificar ese código una y otra vez.
        * 
        * Este código no está cerrado para la modificación si la pizzería 
        * cambia sus ofertas de pizza, tenemos que introducir este código 
        * y modificarlo.
        */
        
      

        if (type.equals("cheese")) { 
            pizza = new CheesePizza ();
        /*} else if (type.equals("greek")) {
            pizza = new GreekPizza();*/
        } else if (type.equals("pepperoni")) {
             pizza = new PepperoniPizza();                    
        } else if (type.equals("clam")) {
            pizza = new ClarnPizza();
        } else if (type.equals("veggie")) {
             pizza = new VeggiePizza();
        }
        
        /**
         * Esto es lo que esperamos seguir igual. En su mayor parte, 
         * la preparación, cocción y envasado de una pizza ha permanecido 
         * igual durante años y años. Por lo tanto, no esperamos que este 
         * código cambie, solo las pizzas en las que opera.
        */
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;


    }
    
}
