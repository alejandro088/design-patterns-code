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
public class Bird extends Animal {

    public Bird()
    {
        flyBehavior = new ItsFlys();
    }
    
    @Override
    public void display() {
        System.out.println("I'm a Bird!!");
    }
    
    public void makeSound()
    {
        System.out.println("I'm a Bird, I can make a cuack!");
    }
    
}
