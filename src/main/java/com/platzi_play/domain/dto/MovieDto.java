package com.platzi_play.domain.dto;

import com.platzi_play.domain.Genre;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record MovieDto(
        Long id,
        @NotBlank(message = "El titulo es obligatorio")
        String title,
        @Min(value = 0, message = "La duracion no puede ser inferior a 0")
        Integer duration,
        @NotNull(message = "El genero debe ser exactamente alguno de estos: ANIMATED, ACTION, DRAMA, COMEDY, HORROR, SCI_FI")
        Genre genre,
        @PastOrPresent(message = "La fecha de estreno debe ser anterior al presente")
        LocalDate releaseDate,
        @Max(value=5, message = "La puntuacion no puede ser superior a 5")
        @Min(value = 0, message = "La puntuciacion no puede ser menor a 0")
        Double rating,
        Boolean status
        ) {
}
