<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Structure\Builder;

/**
 * Description of Product
 *
 * @author Alejandro
 */
class Product {
    
    private $partA;
    
    private $partB;
    
    private $partC;
    
    public function setPartA($partA)
    {
        $this->partA = $partA;       
    }
    
    public function setPartB($partB)
    {
        $this->partB = $partB;        
    }
    
    public function setPartC($partC)
    {
        $this->partC = $partC;        
    }
    
}
