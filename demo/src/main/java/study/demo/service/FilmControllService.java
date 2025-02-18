package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.FilmControllDto;

@Service
public interface FilmControllService {

    FilmControllDto findFilmByMovieNum(Integer movieNum);

    FilmControllDto findFilmByCinemaNum(Integer cinemaNum);
}
