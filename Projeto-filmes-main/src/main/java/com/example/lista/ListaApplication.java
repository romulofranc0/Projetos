package com.example.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ListaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListaApplication.class, args);
    }

}
