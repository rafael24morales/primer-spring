package com.primerc10.ejemplo.springfirst.controladorHolaAdios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controlador {

    @RequestMapping("/hola")
    public String respondeHola(){
        return "adios";
    }

    @RequestMapping("/adios")
    @ResponseBody
    public String respondeAdios(){
        return "adios";
    }

}
