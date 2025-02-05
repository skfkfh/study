package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.demo.dto.MovieDto;
import study.demo.service.MovieService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/title")
    public List<MovieDto> getMovieInfo(@RequestParam String movieTitle) {

        return movieService.getMovieInfo(movieTitle);
    }

    @GetMapping("/no")
    public Optional<MovieDto> getMovieInfoByNo(@RequestParam Integer movieNum) {
        return movieService.getMovieInfoByNum(movieNum);
    }
}
