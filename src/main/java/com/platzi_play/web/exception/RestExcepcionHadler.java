package com.platzi_play.web.exception;

import com.platzi_play.domain.exception.MovieAlreadyExistsException;
import com.platzi_play.domain.exception.MovieNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExcepcionHadler {
    @ExceptionHandler(MovieAlreadyExistsException.class)
    public ResponseEntity<Error> handleException(MovieAlreadyExistsException ex) {
        Error error = new Error("MovieAlreadyExistsException", ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<Error> handleException(MovieNotFoundException ex) {
        Error error = new Error("MovieNotFoundException", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}

