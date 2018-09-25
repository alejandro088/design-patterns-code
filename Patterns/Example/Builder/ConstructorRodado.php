<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\Builder;

/**
 * Description of Builder
 *
 * @author Alejandro
 */
abstract class ConstructorRodado {
    protected $vehicle; // instance of Product
    
    public function getVehicle() 
    {
        return $this->vehicle;
    }
    
    public abstract function buildMotor();
    
    public abstract function buildCombustible();
    
    public abstract function buildAsientos();
    
    public abstract function buildExtras();
    
    
}
