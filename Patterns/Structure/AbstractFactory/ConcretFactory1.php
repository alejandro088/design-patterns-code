<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Structure\AbstractFactory;

/**
 * Description of ConcretFactory
 *
 * @author Alejandro
 */
class ConcretFactory1 extends AbstractFactory {
    //put your code here
    public function makeProductA() {
        return new ProductA1;
    }

    public function makeProductB() {
        return new ProductB1;
    }

}
