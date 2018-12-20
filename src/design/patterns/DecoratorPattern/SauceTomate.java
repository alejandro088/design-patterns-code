package design.patterns.DecoratorPattern;

public class SauceTomate extends IngredientDecorator {

    SauceTomate(Pizza newPizza) {
        
        super(newPizza);
        
    }

    @Override
    public String getDescription() {
        return thePizza.getDescription() + ", sauce tomate";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Sauce Tomate: " + .20);

        
        return thePizza.getCost() + .20;

    }

  

}