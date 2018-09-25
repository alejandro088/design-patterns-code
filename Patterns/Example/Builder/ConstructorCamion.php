<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\Builder;

/**
 * Description of ConcreteABuilder
 *
 * @author Alejandro
 */
class ConstructorCamion extends ConstructorRodado {

    protected $motor;
    protected $combustible;
    protected $extras;
    protected $asientos;

    public function __construct($motor, $combustible, $asientos, $extras) {
        
        $this->vehicle = new Camion();
        
        $this->motor = $motor;
        
        $this->combustible = $combustible;
        
        $this->asientos = $asientos;
        
        $this->extras = $extras;
        
        echo "Creando camion...\n";
        
    }

    public function buildAsientos() {
        $this->vehicle->setAsientos($this->asientos);
        
        echo "Creando asientos...\n";
    }

    public function buildCombustible() {
        $this->vehicle->setCombustible($this->combustible);
        
        echo "Creando tanque de combustible...\n";
    }

    public function buildExtras() {
        $this->vehicle->setExtras($this->extras);        
        
        echo "Añadiendo extras...\n";
        
        $this->vehicle->setCarga();
    }

    public function buildMotor() {
        $this->vehicle->setMotor($this->motor);
        
        echo "Incorporando motor...\n";
    }
    
    public function __toString() {
        return "Creando automovil...<br>";
    }

}
