package com.platzi_play.persistance;

import com.platzi_play.domain.dto.MovieDto;
import com.platzi_play.domain.dto.repository.MovieRepository;
import com.platzi_play.persistance.crud.CrudMovieEntity;
import com.platzi_play.persistance.mapper.MovieMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll() {
        return this.movieMapper.toDtos(this.crudMovieEntity.findAll());
    }
}
