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
public class News implements Observer, DisplayElement {
    
    private City city;

    public News(Subject gpsCity) {
        
        gpsCity.registerObserver(this);
    }
    
    public void getFeaturedNews() {
        System.out.println("Estas son las noticias descatadas para " + city.getName());
    }

    @Override
    public void update(City city) {
        this.city = city;
        display();
    }

    @Override
    public void display() {
        getFeaturedNews();
    }
    
}
