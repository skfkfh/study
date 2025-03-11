package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.BookingDto;
import study.demo.dto.CinemaDto;
import study.demo.dto.MovieDto;
import study.demo.dto.SeatChoiceDto;

import java.util.List;

@Service
public interface BookingService {

    List<MovieDto> getMovieList();

    List<CinemaDto> getCinemaList();

    void bookMovie(BookingDto bookingDto);

    void choiceSeat(SeatChoiceDto seatChoiceDto);
}
