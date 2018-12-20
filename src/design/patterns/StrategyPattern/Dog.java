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
public class Dog extends Animal {

    public Dog()
    {
        flyBehavior = new CantFly();
    }
    
    @Override
    public void display() {
        System.out.println("I'm a Dog!!");
    }
    
    public void makeSound()
    {
        System.out.println("I'm a Dog, I can make a guau!");
    }
    
}
