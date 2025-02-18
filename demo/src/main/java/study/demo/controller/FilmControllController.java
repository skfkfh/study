package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.demo.service.FilmControllService;

@RestController
@RequestMapping("/film")
@RequiredArgsConstructor
public class FilmControllController {

    private final FilmControllService filmControllService;

    public void findFilmByMovieId(Integer movieId) {
        filmControllService.findFilmByMovieId(movieId);
    }
}
