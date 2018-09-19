package com.primerc10.ejemplo.springfirst.controladores.chidos.servicios;

import com.primerc10.ejemplo.springfirst.PowerRangers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class RangersService {

    private List<PowerRangers> rangers = new ArrayList<>(
            Arrays.asList(
                    new PowerRangers(1,"La kimberly","Rosa"),
                    new PowerRangers(2 , "El brayan","Carnita")
            )
    );

    public RangersService() {
    }

    public List<PowerRangers> getAllPowers(){
        return rangers;
    }
}
