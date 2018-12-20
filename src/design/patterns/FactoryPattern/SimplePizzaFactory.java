package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public abstract class SimplePizzaFactory {
    
    /**
     * Primero definimos un método createPizza() en la 
     * fábrica. Este es el método que usarán todos los clientes
     * para crear una instancia de nuevos objetos.
     * @param type
     * @return Pizza1
     **/
    public Pizza1 createPizza(String type){
        
        Pizza1 pizza = null;
        
        /**
         * Aquí está el código que arrancamos del método orderPizza(). 
         * Este código aún está parametrizado por el tipo de pizza, 
         * al igual que nuestro método original orderPizza().
        **/
        
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
