package com.platzi_play.persistance.mapper;

import com.platzi_play.domain.dto.MovieDto;
import com.platzi_play.persistance.entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
//TODO crear un mapeador que devuelva true si estado es D o false en otro caso.
@Mapper(componentModel = "spring", uses = {GenreMapper.class})
public interface MovieMapper {
    @Mapping(source= "titulo", target ="title")
    @Mapping(source= "duracion", target ="duration")
    @Mapping(source= "genero", target ="genre", qualifiedByName = "stringToGenre")
    @Mapping(source= "fechaEstreno", target ="releaseDate")
    @Mapping(source= "clasificacion", target ="rating")
    MovieDto toDto(MovieEntity entity);
    List<MovieDto> toDtos(Iterable<MovieEntity> entities);
}
