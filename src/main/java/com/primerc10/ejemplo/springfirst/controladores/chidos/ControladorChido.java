package com.primerc10.ejemplo.springfirst.controladores.chidos;

import com.primerc10.ejemplo.springfirst.PowerRangers;
import com.primerc10.ejemplo.springfirst.controladores.chidos.servicios.RangersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorChido {

    @Autowired
    RangersService rangersService;

    //RequestMapping es para hacer peticiones y por deafult es GET y PUT
    //@RequestMapping("/PowerRanger")
    @GetMapping("/PowerRanger")
    public List<PowerRangers> getAllPower(){
        return rangersService.getAllPowers();
    }

    @PostMapping("/PowerRanger")
    public void insertRanger(@RequestBody PowerRangers powerRangers){
        rangersService.insertRanger(powerRangers);
    }




}
