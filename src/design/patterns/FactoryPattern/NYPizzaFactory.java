package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public class NYPizzaFactory extends SimplePizzaFactory {
    
    @Override
    public Pizza1 createPizza(String type){
        
        Pizza1 pizza = null;        
              
        if (type.equals("cheese")) { 
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();	
        } else if (type.equals("clam")) {
            pizza = new NYStyleClarnPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        
        return pizza;
    }  
    
}
