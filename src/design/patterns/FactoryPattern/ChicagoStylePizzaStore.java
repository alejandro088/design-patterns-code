package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public class ChicagoStylePizzaStore extends ShopPizza4 {
    
    ChicagoPizzaFactory factory;

    public ChicagoStylePizzaStore() {
        this.factory = new ChicagoPizzaFactory();
    }

    @Override
    public Pizza1 createPizza(String type) {
        
        pizza = factory.createPizza(type);
        
        return pizza;
    }
    
}
