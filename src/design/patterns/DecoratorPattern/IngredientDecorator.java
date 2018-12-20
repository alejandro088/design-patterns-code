package design.patterns.DecoratorPattern;

public abstract class IngredientDecorator extends Pizza {
    
    protected Pizza thePizza;
    
    IngredientDecorator(Pizza newPizza) {
        thePizza = newPizza;
    }

    @Override
    public abstract String getDescription();

}