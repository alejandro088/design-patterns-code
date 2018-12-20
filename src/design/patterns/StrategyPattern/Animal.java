/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.StrategyPattern;

/**
 *
 * @author Alejandro
 */
public abstract class Animal {
    
    FlyBehavior flyBehavior;
    
    public Animal(){
        
    }
    
    public abstract void display();
    
    public void makeSound()
    {
        System.out.println("I'm a Animal, I can make a sound");
    }
    
    public void eat()
    {
        System.out.println("I'm a Animal, I can eat a food");
    }
    
    public void tryToFly()
    {
        flyBehavior.fly();
    }
    
    // If you want to be able to change the flyBehavior dynamically
    // add the following method
    public void setFlyingAbility(FlyBehavior newFlyBehavior){
        flyBehavior = newFlyBehavior;
    }
    
}
