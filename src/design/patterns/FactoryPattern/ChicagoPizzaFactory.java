package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public class ChicagoPizzaFactory {
    
    public Pizza1 createPizza(String type){
        
        Pizza1 pizza = null;
        
              
        if (type.equals("cheese")) { 
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza ();	
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClarnPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        
        return pizza;
    }  
    
}
