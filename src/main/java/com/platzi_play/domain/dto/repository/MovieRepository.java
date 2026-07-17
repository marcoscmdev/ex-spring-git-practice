package com.platzi_play.domain.dto.repository;

import com.platzi_play.domain.dto.MovieDto;
import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
    MovieDto getById(Long id);
    MovieDto save(MovieDto movieDto);
}
