package com.primerc10.ejemplo.springfirst.controladorHolaAdios;

import com.primerc10.ejemplo.springfirst.PowerRangers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

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


    @RequestMapping("/nombre")
    public String addNombre(Model model){

        model.addAttribute("nombre","Juanchito");

        return "hola";
    }

    @RequestMapping("/{id}/{nombre}")
    public String addModel(Model model, @PathVariable int id, @PathVariable String nombre){

        model.addAttribute("id",id);
        model.addAttribute("nombre",nombre);

        return "hola";
    }

    @RequestMapping("/otro/{id}/{nombre}")
    public String addModelString(Model model, @PathVariable String id, @PathVariable String nombre){

        model.addAttribute("id",id);
        model.addAttribute("nombre",nombre);

        return "hola";
    }

    @RequestMapping("/YEEEI")
    @ResponseBody
    public List<PowerRangers> listar(){
        return Arrays.asList(
          new PowerRangers(1,"ElJuan","Rojo"),
          new PowerRangers(2,"ElLuperto","Morado")
        );
    }


}
