package com.platzi_play.domain.dto.repository;

import com.platzi_play.domain.dto.MovieDto;
import com.platzi_play.persistance.entity.MovieEntity;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
}
