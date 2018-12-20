package design.patterns.FactoryPattern;

public class MakePizza1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Version 0
        ShopPizza shop = new ShopPizza();
        shop.orderPizza();
        */
        
        /* Version 2
        ShopPizza2 shop = new ShopPizza2();
        shop.orderPizza("cheese");
        */
        
        /* Version 3
        ShopPizza3 shop = new ShopPizza3(new SimplePizzaFactory());
        shop.orderPizza("cheese");
        */
        
        ShopPizza4 shop = new ChicagoStylePizzaStore();
        shop.orderPizza("cheese");
        
    }
    
}
