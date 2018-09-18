package com.primerc10.ejemplo.springfirst.musica;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReproductorConfiguration {

    @Bean
    public IReproduccion vinilo(){
        return new Vinilo();
    }

    @Bean
    public IReproduccion cassette(){
        return new Cassette();
    }



}
