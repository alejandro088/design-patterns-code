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
public class GgsCityTest {
     public static void main(String[] args)
     {
         GpsCity gpscity = new GpsCity();         
         
         Weather weather = new Weather(gpscity);
         News news = new News(gpscity);
         
         gpscity.visit(new City("Mar del Plata"));         
         
         gpscity.visit(new City("Tandil"));         
         
     }    
}
