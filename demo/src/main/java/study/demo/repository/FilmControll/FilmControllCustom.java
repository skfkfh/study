package study.demo.repository.FilmControll;

import study.demo.dto.CinemaDto;
import study.demo.dto.MovieDto;

import java.util.List;

public interface FilmControllCustom {

    List<MovieDto> getMovieList(String yyyy, String mm, String day, String hour);

    List<CinemaDto> getCinemaList(String yyyy, String mm, String day, String hour);
}
