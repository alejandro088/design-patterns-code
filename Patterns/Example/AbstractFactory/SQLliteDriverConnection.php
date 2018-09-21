<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\AbstractFactory;

/**
 * Description of SQLliteDriverConnection
 *
 * @author Alejandro
 */
class SQLliteDriverConnection extends Connection {
    //put your code here
    public function makeDatabaseConnection() {
        return new SQLliteDatabase(db('sqlite'));
    }

    public function makeORMConnection() {
        return new ORMSQLlite;
    }
    
    public function __toString() {
        return __class__;
    }

}
