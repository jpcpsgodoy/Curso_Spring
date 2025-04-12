package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' HH:mm:ss");
        String formatado = dataHoraAtual.format(formatador);
        return "Hello, Spring Boot!" + " Message sent on " + formatado;
    }
}