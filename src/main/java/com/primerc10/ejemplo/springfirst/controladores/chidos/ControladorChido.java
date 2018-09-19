package com.primerc10.ejemplo.springfirst.controladores.chidos;

import com.primerc10.ejemplo.springfirst.PowerRangers;
import com.primerc10.ejemplo.springfirst.controladores.chidos.servicios.RangersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorChido {

    @Autowired
    RangersService rangersService;

    @RequestMapping("/PowerRanger")
    public List<PowerRangers> getAllPower(){
        return rangersService.getAllPowers();
    }

}
