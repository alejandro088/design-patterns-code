package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public class CaliforniaPizzaFactory {
    
    public Pizza1 createPizza(String type){
        
        Pizza1 pizza = null;
        
              
        if (type.equals("cheese")) { 
        pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
         pizza = new PepperoniPizza ();	
         } else if (type.equals("clam")) {
        pizza = new ClarnPizza();
        } else if (type.equals("veggie")) {
         pizza = new VeggiePizza();
        }
        return pizza;
    }  
    
}
