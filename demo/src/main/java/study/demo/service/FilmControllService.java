package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.FilmControllDto;

@Service
public interface FilmControllService {

    FilmControllDto findFilmByMovieTitle(String movieTitle);

    FilmControllDto findFilmByCinemaNum(Integer cinemaNum);

    FilmControllDto createFilm(FilmControllDto filmControllDto);
}
