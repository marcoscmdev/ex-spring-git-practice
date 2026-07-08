package com.platzi_play;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {
    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma del Curso de Gestión de peliculas Platzi-Play. Usa menos de 120
            caracteres y hazlo con el estilo de Platzi, son unos buenos flipados""")
     String generateGretting();
}
