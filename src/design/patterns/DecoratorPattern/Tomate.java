package design.patterns.DecoratorPattern;

public class Tomate extends IngredientDecorator {

    public Tomate(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return thePizza.getDescription() + ", tomate";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Tomate: " + 1.50);

        
        return thePizza.getCost() + 1.50;

    }

  

}