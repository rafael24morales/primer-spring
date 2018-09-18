package com.primerc10.ejemplo.springfirst.musica;

public class Vinilo implements IReproduccion {
    @Override
    public String reproducirLaRola() {
        return "Reproduciendo desde " + getClass().getSimpleName() ;
    }
}
