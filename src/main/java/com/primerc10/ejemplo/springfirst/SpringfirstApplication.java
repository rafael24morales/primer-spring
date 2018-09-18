package com.primerc10.ejemplo.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringfirstApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringfirstApplication.class, args);

        String[] beanNombres = run.getBeanDefinitionNames();

        Arrays.sort(beanNombres);

        for(String nombre : beanNombres){
            System.out.println(nombre);
        }

        Object pojo = run.getBean("miPojito");
        System.out.println(pojo);


    }
}
