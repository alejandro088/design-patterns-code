package design.patterns.DecoratorPattern;

public class NapolitanPizza extends Pizza {

    private double cost = 6.00;
    private String description = "The Napolitan's Pizza";
    

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

  

}