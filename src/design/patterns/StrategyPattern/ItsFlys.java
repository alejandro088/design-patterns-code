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
public class ItsFlys implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
    
}
