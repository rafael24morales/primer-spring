package com.primerc10.ejemplo.springfirst.pojito;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("miPojito")
public class Pojo {

    @Value("${mipojo.mensaje1}")
    private String mensaje1;

    @Value("${mipojo.mensaje2}")
    private String mensaje2;

    @Value("${mipojo.mensaje3}")
    private String mensaje3;

    public Pojo(){}

    public Pojo(String mensaje1, String mensaje2, String mensaje3) {

        this.mensaje1 = mensaje1;
        this.mensaje2 = mensaje2;
        this.mensaje3 = mensaje3;
    }


    public String getMensaje1() {
        return mensaje1;
    }

    public void setMensaje1(String mensaje1) {
        this.mensaje1 = mensaje1;
    }

    public String getMensaje2() {
        return mensaje2;
    }

    public void setMensaje2(String mensaje2) {
        this.mensaje2 = mensaje2;
    }

    public String getMensaje3() {
        return mensaje3;
    }

    public void setMensaje3(String mensaje3) {
        this.mensaje3 = mensaje3;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "mensaje1='" + mensaje1 + '\'' +
                ", mensaje2='" + mensaje2 + '\'' +
                ", mensaje3='" + mensaje3 + '\'' +
                '}';
    }
}
