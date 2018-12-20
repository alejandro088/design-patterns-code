
package design.patterns.DecoratorPattern;

/**
 *
 * @author Alejandro
 */
public class MakePizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //making pizza of Mozzarella
        Pizza pizza1 = new MozzarellaPizza();
        
        //making pizza of Mozzarella without oregano
        Pizza pizza3 = new MozzarellaPizza();
        
        //making napolitan pizza
        Pizza pizza2 = new NapolitanPizza();
        
        
        pizza1 = new Oregano(new SauceTomate(new Mozzarella(pizza1)));
        
        pizza3 = new SauceTomate(new Mozzarella(new Mozzarella(new Mozzarella(pizza3))));

        /*
        //add Mozzarella
        pizza1 = new Mozzarella(pizza1);
        
        //add sauce Tomate
        pizza1 = new SauceTomate(pizza1);
        
        //add Oregano
        pizza1 = new Oregano(pizza1);
        */
        
        //add Mozarella
        pizza2 = new Mozzarella(pizza2);
        
        //add sauce Tomate
        pizza2 = new SauceTomate(pizza2);
        
        //add Tomate
        pizza2 = new Tomate(pizza2);
        
        System.out.println("Ingredients: " + pizza1.getDescription());
        
        System.out.println("Price: " + pizza1.getCost());
        
        System.out.println("=============================================");        
        
        System.out.println("Ingredients: " + pizza2.getDescription());
        
        System.out.println("Price: " + pizza2.getCost());
        
        System.out.println("=============================================");        
        
        System.out.println("Ingredients: " + pizza3.getDescription());
        
        System.out.println("Price: " + pizza3.getCost());

        
        
        
    }
    
}
