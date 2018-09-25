<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

require_once('../../vendor/autoload.php');

$director = new Patterns\Example\Builder\FabricaVehiculos();

$motor = "Ford Falcon";

$combustible = "Nafta";

$extras = array("carga" => 10000, "features" => array("DVD", "Airbag", "Radio"));

$asientos = new \Patterns\Example\Builder\Asientos(4, "Cuero");

$automovil = new Patterns\Example\Builder\ConstructorCamion($motor, $combustible, $asientos, $extras);

$director->setVehicleBuilder($automovil); //Set vehicle to builder

$director->buildVehicle(); //Build vehicle

$vehicle = $director->getVehicle(); //Get vehicle complete

echo $vehicle;
