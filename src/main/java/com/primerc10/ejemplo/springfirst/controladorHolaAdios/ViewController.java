package com.primerc10.ejemplo.springfirst.controladorHolaAdios;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class ViewController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        //se pueden registrar muchas vistas D:
        registry.addViewController("/holi").setViewName("hola");

    }

}
