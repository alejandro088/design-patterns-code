<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

require_once('../../vendor/autoload.php');

$director = new Patterns\Structure\Builder\Director();

$productA = new \Patterns\Structure\Builder\ConcreteABuilder();

$productB = new \Patterns\Structure\Builder\ConcreteBBuilder();

$director->setProductBuilder($productA);

$director->buildProduct();

$product = $director->getProduct();

var_dump($product);

$director->setProductBuilder($productB);

$director->buildProduct();

$product = $director->getProduct();

var_dump($product);
