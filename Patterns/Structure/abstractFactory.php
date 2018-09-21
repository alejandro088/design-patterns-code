<?php

require_once('../../vendor/autoload.php');


/**
 * Example Code Client AbstractFactory Pattern
 * You should change the ConcretFactory to makeProduct in your ConcretFactory,
 * in this example, change ConcretFactory1 to ConcretFactory2
 */

echo "new ConcretFactory1";

$factory = new \Patterns\Structure\AbstractFactory\ConcretFactory1;

$productA = $factory->makeProductA();

$productB = $factory->makeProductB();

var_dump($productA); //object(Patterns\Structure\AbstractFactory\ProductA1)[2]

var_dump($productB); //object(Patterns\Structure\AbstractFactory\ProductB1)[4]


echo "new ConcretFactory2";

$factory = new \Patterns\Structure\AbstractFactory\ConcretFactory2;

$productA = $factory->makeProductA();

$productB = $factory->makeProductB();

var_dump($productA); //object(Patterns\Structure\AbstractFactory\ProductA2)[2]

var_dump($productB); //object(Patterns\Structure\AbstractFactory\ProductB2)[4]


