package design.patterns.DecoratorPattern;

public class Oregano extends IngredientDecorator {

    public Oregano(Pizza newPizza) {
        
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return thePizza.getDescription() + ", oregano";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Oregano: " + .20);

        
        return thePizza.getCost() + .20;

    }

  

}