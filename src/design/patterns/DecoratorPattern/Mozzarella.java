package design.patterns.DecoratorPattern;

public class Mozzarella extends IngredientDecorator {

    Mozzarella(Pizza newPizza) {
        
        super(newPizza);
        
    }

    @Override
    public String getDescription() {
        return thePizza.getDescription() + ", mozzarella";

    }

    @Override
    public double getCost() {
        System.out.println("Cost of Moz: " + .50);

        
        return thePizza.getCost() + .50;

    }

  

}