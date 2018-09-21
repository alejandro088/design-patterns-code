<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Structure\AbstractFactory;

/**
 * Description of ConcretFactory2
 *
 * @author Alejandro
 */
class ConcretFactory2 extends AbstractFactory {
    //put your code here
    public function makeProductA() {
        return new ProductA2;
    }

    public function makeProductB() {
        return new ProductB2;
    }
}
