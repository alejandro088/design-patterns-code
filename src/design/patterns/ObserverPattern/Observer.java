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
public interface Observer {
    
    /**
     * La interfaz Observer es implementada por todos los observadores,  
     * ellos tienen que implementar el método update(). Aquí le pasamos
     * la ciudad actual a los observadores.
     * 
    */
    public void update(City city);    
}
