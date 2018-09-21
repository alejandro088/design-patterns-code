<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\AbstractFactory;

/**
 * Description of MySQLDriverConnection
 *
 * @author Alejandro
 */
class MySQLDriverConnection extends Connection {
    
    public function makeDatabaseConnection() {
        
        return new MySQLDatabase(db('mysql'));
    }

    public function makeORMConnection() {
        return new ORMMySQL;
        
    }
    
    public function __toString() {
        return __class__;
    }

}
