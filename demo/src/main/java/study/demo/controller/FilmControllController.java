package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.demo.dto.CinemaDto;
import study.demo.dto.FilmControllDto;
import study.demo.service.FilmControllService;

@RestController
@RequestMapping("/film")
@RequiredArgsConstructor
public class FilmControllController {

    private final FilmControllService filmControllService;

    @GetMapping("/movieNum")
    public FilmControllDto findFilmByMovieNum(@RequestParam Integer movieNum) {
        return filmControllService.findFilmByMovieNum(movieNum);
    }

    @GetMapping("/cinemaNum")
    public FilmControllDto findFilmByCinemaNum(@RequestParam Integer cinemaNum) {
        return filmControllService.findFilmByCinemaNum(cinemaNum);
    }
}
