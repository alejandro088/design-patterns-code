<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Structure\Builder;

/**
 * Description of ConcreteABuilder
 *
 * @author Alejandro
 */
class ConcreteABuilder extends Builder {
    
    public function __construct() {
        $this->product = new Product();
    }
    
    public function buildPartA() {
        $this->product->setPartA("Parte A Producto 1");
    }

    public function buildPartB() {
        $this->product->setPartB("Parte B Producto 1");
    }

    public function buildPartC() {
        $this->product->setPartC("Parte C Producto 1");
    }

}
