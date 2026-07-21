package com.platzi_play.domain.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record UpdateMovieDto(
        @NotBlank(message = "El titulo es obligatorio")
        String title,
        @PastOrPresent(message = "La fecha de estreno debe de ser anterior a la fecha actual")
        LocalDate releaseDate,
        @Max(value=5, message = "La puntuacion no puede ser superior a 5")
        @Min(value = 0, message = "La puntuciacion no puede ser menor a 0")
        Double rating
        ) {
}
