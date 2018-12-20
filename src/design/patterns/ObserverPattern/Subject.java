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
public interface Subject {
    
    /**
     * Éstos metodos obtienen un Observer como argumento;
     * que es, el Observer a ser registrado o eliminado.
     * 
     */
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    
    
    /**
     * Este método es llamado para notificar a todos los observadores
     * cuando el estado del sujeto ha sido cambiado.
     * 
     */
    
    public void notifyObserver();
    
}
