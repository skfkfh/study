package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.demo.dto.BookingDto;
import study.demo.dto.CinemaDto;
import study.demo.dto.MovieDto;
import study.demo.entity.UserBook;
import study.demo.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @GetMapping("/movie")
    public List<MovieDto> getMovieList() {
        return bookingService.getMovieList();
    }

    @GetMapping("/choiceCinema")
    public List<CinemaDto> getCinemaList() {
        return bookingService.getCinemaList();
    }

    @PostMapping("/new")
    public void bookMovie(@RequestBody BookingDto bookingDto) {

        bookingService.bookMovie(bookingDto);
    }
}
