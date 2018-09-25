<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
namespace Patterns\Example\Builder;
/**
 * Description of Asientos
 *
 * @author Alejandro
 */
class Asientos {

    private $tapizado;
    private $numAsientos;

    public function __construct($numAsientos, $tapizado) {
        
        $this->numAsientos = $numAsientos;
        $this->tapizado = $tapizado;
    }
    
    public function __toString() {
        return "Tapizado: $this->tapizado, Asientos: $this->numAsientos";
    }
}
