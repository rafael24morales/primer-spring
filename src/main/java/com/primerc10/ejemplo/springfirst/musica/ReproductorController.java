package com.primerc10.ejemplo.springfirst.musica;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReproductorController {
    //Normalmente nosotros traemos las dependiencias de la siguiente forma
    //IReproduccion cassete = new Cassette();

    //Inyección por constructor
    /*private IReproduccion cass;
    private IReproduccion vini;

    @Autowired
    public ReproductorController(IReproduccion cassette, IReproduccion vinilo){
        cass = cassette;
        vini = vinilo;
    }*/

    //con setters tambien se puede:
    /*
    private IReproduccion cass;

    @Autowired
    public void setReproduccionCassette(IReproduccion cassette){
        cass = cassette;
    }*/


    @Autowired
    private @Qualifier("cassette") IReproduccion cass;

    @Autowired
    private IReproduccion vinilo;


    @RequestMapping(value= "/cassette", method = RequestMethod.GET)
    @ResponseBody
    public String getCassette(){
        return cass.reproducirLaRola();
    }

    @RequestMapping(value= "/vinilo", method = RequestMethod.GET)
    @ResponseBody
    public String getVinilo(){
        return vinilo.reproducirLaRola();
    }


}
