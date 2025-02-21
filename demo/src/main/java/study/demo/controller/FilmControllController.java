package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.demo.dto.CinemaDto;
import study.demo.dto.FilmControllDto;
import study.demo.service.FilmControllService;

@RestController
@RequestMapping("/film")
@RequiredArgsConstructor
public class FilmControllController {

    private final FilmControllService filmControllService;

    @GetMapping("/movieTitle")
    public FilmControllDto findFilmByMovieTitle(@RequestParam String movieTitle) {
        return filmControllService.findFilmByMovieTitle(movieTitle);
    }

    @GetMapping("/cinemaNum")
    public FilmControllDto findFilmByCinemaNum(@RequestParam Integer cinemaNum) {
        return filmControllService.findFilmByCinemaNum(cinemaNum);
    }

    @PostMapping("/create")
    public FilmControllDto createFilm(@RequestBody FilmControllDto filmControllDto) {
        return filmControllService.createFilm(filmControllDto);
    }
}
