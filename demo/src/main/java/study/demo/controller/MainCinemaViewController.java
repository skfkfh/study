package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.demo.dto.MovieDto;
import study.demo.service.MainCinemaViewService;

import java.util.List;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainCinemaViewController {

    private final MainCinemaViewService mainCinemaViewService;

    @GetMapping("/main")
    public List<MovieDto> getMainMovieList() {
        return mainCinemaViewService.getMainMovieList();
    }
}
