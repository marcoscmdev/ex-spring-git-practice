package com.platzi_play.domain.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(long id) {
        super("La pelicula no existe");
    }
}
