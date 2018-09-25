<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Structure\Builder;

/**
 * Description of Builder
 *
 * @author Alejandro
 */
abstract class Builder {
    protected $product; // instance of Product
    
    public function getProduct() 
    {
        return $this->product;
    }
    
    public abstract function buildPartA();
    
    public abstract function buildPartB();
    
    public abstract function buildPartC();
    
    
}
