<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\Builder;

/**
 * Description of Product
 *
 * @author Alejandro
 */
class Vehicle {
    
    protected $motor;
    
    protected $combustible;
    
    protected $asientos;
    
    protected $extras = array();
    
    public function setMotor($motor)
    {
        $this->motor = $motor;       
    }
    
    public function setCombustible($combustible)
    {
        $this->combustible = $combustible;        
    }
    
    public function setAsientos(Asientos $asientos)
    {
        $this->asientos = $asientos;        
    }
    
    public function setExtras($extras)
    {
        $this->extras = $extras;
    }
    
    public function __toString() {
        
        $extras = implode(", ", $this->extras['features']);
        return 
            "<h2>Automovil creado</h2>
            <ul>
            <li>Motor: $this->motor</li>
            <li>Combustible: $this->combustible</li>
            <li>Asientos: $this->asientos</li>
            <li>Extras: $extras</li>
            </ul>";
    }
    
}
