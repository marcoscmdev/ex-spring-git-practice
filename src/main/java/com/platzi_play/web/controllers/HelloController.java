package com.platzi_play.web.controllers;

import com.platzi_play.domain.service.PlatziPlayAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final PlatziPlayAiService AISERVICE;
    // definir el entorno
    private final String PLATAFORM;

    public HelloController(PlatziPlayAiService aiservice, @Value("${spring.application.name}") String plataform) {
        AISERVICE = aiservice;
        PLATAFORM = plataform;
    }

    @GetMapping("/hello")
    public String saludo(){
        return this.AISERVICE.generateGretting(PLATAFORM);
    }
}
