package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.demo.dto.CinemaDto;
import study.demo.service.CinemaService;

@RestController
@RequestMapping("/cinema")
@RequiredArgsConstructor
public class CinemaController {

    private final CinemaService cinemaService;

    @GetMapping("/info")
    public CinemaDto getCinemaInfoById(Integer id) {
        return cinemaService.getCinemaInfoById(id);
    }
}
