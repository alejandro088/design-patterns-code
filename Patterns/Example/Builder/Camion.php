<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\Builder;

/**
 * Description of Camion
 *
 * @author Alejandro
 */
class Camion extends Vehicle{
    //put your code here
    protected $carga;
    
    public function setCarga()
    {
        $this->carga = $this->extras['carga'];
        
        echo "Añadiendo carga...\n";
    }
    
    public function getCarga()
    {
        return $this->carga;
    }


    public function __toString() {
        
        $extras = implode(", ", $this->extras['features']);
        
        $carga = $this->getCarga() ? "<li>Carga: {$this->getCarga()} toneladas" : null ;
        return 
            "<h2>Camion creado</h2>
            <ul>
            <li>Motor: $this->motor</li>
            <li>Combustible: $this->combustible</li>
            <li>Asientos: $this->asientos</li>
            <li>Extras: $extras</li>
            $carga
            </ul>";
    }
}
