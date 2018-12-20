package design.patterns.DecoratorPattern;

public class MozzarellaPizza extends Pizza {

    private double cost = 4.00;
    private String description = "The Moozarella's Pizza";
    

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

  

}