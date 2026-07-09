package com.platzi_play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {
    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma del Curso de Gestión de peliculas {{plataform}}. Usa menos de 80
                                                      caracteres y hazlo con el estilo de Platzi""")
     String generateGretting(@V("plataform") String plataform);
}
