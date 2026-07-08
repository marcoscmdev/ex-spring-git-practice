package com.platzi_play;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final PlatziPlayAiService AISERVICE;

    public HelloController(PlatziPlayAiService aiservice) {
        AISERVICE = aiservice;
    }

    @GetMapping("/")
    public String saludo(){
        return this.AISERVICE.generateGretting();
    }
}
