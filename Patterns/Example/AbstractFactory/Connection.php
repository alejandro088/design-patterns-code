<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\AbstractFactory;

/**
 * Description of AbstractFactory
 *
 * @author Alejandro
 */
abstract class Connection {
    //put your code here
    abstract public function makeDatabaseConnection();
    
    abstract public function makeORMConnection();
    
}
