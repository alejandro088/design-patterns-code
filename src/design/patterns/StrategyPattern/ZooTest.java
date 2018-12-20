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
public class ZooTest {
    public static void main(String[] args)
    {
        Animal tweety = new Bird();
        
        tweety.tryToFly();
        
        tweety.display();
        
        Animal snoopy = new Dog();
        
        snoopy.tryToFly();
        
        snoopy.display();
        
        tweety.setFlyingAbility(new CantFly());
        
        tweety.display();
        
        tweety.tryToFly();
                
    }
}
