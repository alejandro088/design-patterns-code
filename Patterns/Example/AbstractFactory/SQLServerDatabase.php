<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\AbstractFactory;

/**
 * Description of SQLServerDatabase
 *
 * @author Alejandro
 */
class SQLServerDatabase extends Database {
    //put your code here
    public function connect() {
        echo "Soy un SQL Server";
    }
}
