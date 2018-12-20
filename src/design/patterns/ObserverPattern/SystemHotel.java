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
public class SystemHotel implements Observer, DisplayElement {
    
    private City city;
    
    public SystemHotel(City newCity, Subject gpsCity)
    {
        city = newCity;
        gpsCity.registerObserver(this);
    }
    
    
    public void welcome()
    {
        System.out.println("Bienvenido a la cadena hotelera mas importante de la ciudad de " + city.getName());
    }

    @Override
    public void update(City city) {
        this.city = city;
        display();
    }

    @Override
    public void display() {
        welcome();
    }
    
}
