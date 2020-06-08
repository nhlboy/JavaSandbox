package com.example.demo;

import com.example.demo.module.Promoter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
//        Promoter promoter = Promoter
//                .builder() //сделает дефолтный конструткор
//                .id(1)
//                .name("Dana White")
//                .build(); // окончательная сборка
    }


}
