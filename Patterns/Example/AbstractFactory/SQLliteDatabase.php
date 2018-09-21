<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\AbstractFactory;

/**
 * Description of SQLliteDatabase
 *
 * @author Alejandro
 */
class SQLliteDatabase extends Database {
    //put your code here
    protected $config;
    
    public function __construct($config) {
        $this->config = $config;
    }
    
    public function connect() {
        var_dump($this->config);
    }
}
