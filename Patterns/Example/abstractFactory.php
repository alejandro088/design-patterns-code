<?php

require_once('../../vendor/autoload.php');



function db($driver)
{
    
    $config = require('AbstractFactory/config.php');
    
    return $config['connections'][$driver];
}


/**
 * Example Code Client AbstractFactory Pattern
 * You should change the MySQLDriverConnection to makeDatabaseConnection in your ConcretFactory,
 * in this example, change MySQLDriverConnection to SQLliteDriverConnection
 */


$driver = new \Patterns\Example\AbstractFactory\MySQLDriverConnection();
//$driver = new \Patterns\Example\AbstractFactory\SQLliteDriverConnection();

echo $driver;

$database = $driver->makeDatabaseConnection();

$orm = $driver->makeORMConnection();

echo "<br><br>";

$database->connect();

echo "<br><br>";

$orm->show();

echo "<br><br>";