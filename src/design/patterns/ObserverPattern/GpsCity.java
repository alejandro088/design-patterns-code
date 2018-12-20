/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.ObserverPattern;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class GpsCity implements Subject{

    private ArrayList observers;
    
    public City city;
    
    public GpsCity(){
        observers = new ArrayList();
    }
    
    public void updateCity(City newCity){
        
        city = newCity;        
      
    }
    
    public void visit(City newCity)
    {
        
        updateCity(newCity);       
        
        getDisplayWelcome(); 

        notifyObserver();          
        
    }
    
    public City getCity()
    {
        return city;
    }

    public void getDisplayWelcome() {
        System.out.println("Visitando... " + city.getName());
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
        
    }

    @Override
    public void notifyObserver() {
        
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(city);
        }
    }
}
