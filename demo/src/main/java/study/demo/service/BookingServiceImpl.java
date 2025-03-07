package study.demo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.BookingDto;
import study.demo.dto.CinemaDto;
import study.demo.dto.MovieDto;
import study.demo.entity.Cinema;
import study.demo.entity.Movie;
import study.demo.entity.UserBook;
import study.demo.repository.*;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService{

    private final MovieRepository movieRepository;
    private final CinemaRepository cinemaRepository;
    private final UserBookRepository userBookRepository;

    @Override
    public List<MovieDto> getMovieList() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieDto> movieDtos = new ArrayList<>();

        movies.forEach(e -> {
            MovieDto movieDto = new MovieDto(
                    e.getMovieNum(),
                    e.getMovieTitle(),
                    e.getMovieAge(),
                    e.getMovieCost()
            );
            movieDtos.add(movieDto);
        });
        return movieDtos;
    }

    @Override
    public List<CinemaDto> getCinemaList() {
        List<Cinema> cinemas = cinemaRepository.findAll();
        List<CinemaDto> cinemaDtos = new ArrayList<>();

        cinemas.forEach(e -> {
            CinemaDto cinemaDto = new CinemaDto(
                    e.getCinemaNum(),
                    e.getCinemaName()
            );
            cinemaDtos.add(cinemaDto);
        });
        return cinemaDtos;
    }

    @Override
    @Transactional
    public void bookMovie(BookingDto bookingDto) {
        UserBook userBook = new UserBook();
        userBook.setMovieNum(bookingDto.getMovieNum());
        userBook.setCinemaNum(bookingDto.getCinemaNum());
        userBook.setRoomId(bookingDto.getRoomId());
        userBook.setBookAmount(bookingDto.getBookAmount());

        userBookRepository.save(userBook);
    }
}
