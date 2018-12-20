/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.ObserverPattern;

/**
 *
 * @author Alejandro
 */
public class City {
    
    private String name;
    
    public City(String newCityName)
    {
        name = newCityName;
    }

    public String getName() {
        return name;
    }
    
}
