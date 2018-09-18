package com.primerc10.ejemplo.springfirst.musica;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReproductorController {

    @Autowired
    private IReproduccion cassette;

    @Autowired
    private IReproduccion vinilo;


    @RequestMapping(value= "/cassette", method = RequestMethod.GET)
    @ResponseBody
    public String getCassette(){
        return cassette.reproducirLaRola();
    }

    @RequestMapping(value= "/vinilo", method = RequestMethod.GET)
    @ResponseBody
    public String getVinilo(){
        return vinilo.reproducirLaRola();
    }


}
