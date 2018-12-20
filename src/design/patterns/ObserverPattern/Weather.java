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
public class Weather implements Observer, DisplayElement {

    private City city;
    
    public Weather(Subject gpsCity) 
    {
        gpsCity.registerObserver(this);        
    }

    public void show() {
        System.out.println("Su pronostico para " + city.getName() + " será actualizado en breve...");
    }

    @Override
    public void update(City city) {
        this.city = city;
        display();
    }

    @Override
    public void display() {
        show();
    }
    
}
