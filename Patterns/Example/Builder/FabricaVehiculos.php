<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace Patterns\Example\Builder;

/**
 * Description of Director
 *
 * @author Alejandro
 */
class FabricaVehiculos {
    private $vehicleBuilder;
    
    public function setVehicleBuilder(ConstructorRodado $builder)
    {
        $this->vehicleBuilder = $builder;
    }
    
    public function getVehicle()
    {
        return $this->vehicleBuilder->getVehicle();
    }
    
    public function buildVehicle()
    {
        $this->vehicleBuilder->buildMotor();
        
        $this->vehicleBuilder->buildCombustible();
        
        $this->vehicleBuilder->buildAsientos();
        
        $this->vehicleBuilder->buildExtras();
    }
    
}
