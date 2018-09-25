<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Structure\Builder;

/**
 * Description of Director
 *
 * @author Alejandro
 */
class Director {
    private $productBuilder;
    
    public function setProductBuilder(Builder $builder)
    {
        $this->productBuilder = $builder;
    }
    
    public function getProduct()
    {
        return $this->productBuilder->getProduct();
    }
    
    public function buildProduct()
    {
        $this->productBuilder->buildPartA();
        
        $this->productBuilder->buildPartB();
        
        $this->productBuilder->buildPartC();
    }
    
}
