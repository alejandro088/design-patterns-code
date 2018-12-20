package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public abstract class ShopPizza4 {

    protected Pizza1 pizza;
       
    /**
     *
     * @param type
     * @return Pizza1
     */
    public Pizza1 orderPizza(String type) {  

                
        pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;

    }

    public abstract Pizza1 createPizza(String type);
    
}
