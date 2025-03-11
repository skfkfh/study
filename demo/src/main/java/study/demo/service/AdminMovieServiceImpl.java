package study.demo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.AdminMovieRegisterDto;
import study.demo.dto.CinemaDto;
import study.demo.dto.MovieDto;
import study.demo.dto.ScreeningRoomDto;
import study.demo.entity.Cinema;
import study.demo.entity.FilmControll;
import study.demo.entity.Movie;
import study.demo.entity.ScreeningRoom;
import study.demo.repository.CinemaRepository;
import study.demo.repository.FilmControll.FilmControllRepository;
import study.demo.repository.MovieRepository;
import study.demo.repository.ScreeningRoomRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminMovieServiceImpl implements AdminMovieService {

    private final MovieRepository movieRepository;
    private final ScreeningRoomRepository screeningRoomRepository;
    private final FilmControllRepository filmControllRepository;
    private final CinemaRepository cinemaRepository;

    @Override
    public List<CinemaDto> getCinemaList() {
        List<Cinema> cinemas = cinemaRepository.findAll();
        List<CinemaDto> cinemasDto = new ArrayList<>();

        cinemas.forEach(e -> {
            CinemaDto cinemaDto = new CinemaDto(
                    e.getCinemaNum(),
                    e.getCinemaName(),
                    e.getCinemaTel(),
                    e.getCinemaAdd()
            );
            cinemasDto.add(cinemaDto);
        });
        return cinemasDto;
    }

    @Override
    public List<MovieDto> getMovieList() {

        List<Movie> movies = movieRepository.findAll();
        List<MovieDto> movieDtos = new ArrayList<>();

        movies.forEach(e -> {
            MovieDto movieDto = new MovieDto(
                    e.getMovieNum(),
                    e.getMovieTitle(),
                    e.getMovieCost(),
                    e.getMovieAge()
            );
            movieDtos.add(movieDto);
        });
        return movieDtos;
    }

    @Override
    public List<ScreeningRoomDto> getRoomList(Integer cinemaNum) {
        List<ScreeningRoom> screeningRooms = screeningRoomRepository.findByCinemaNum(cinemaNum);
        List<ScreeningRoomDto> screeningRoomDtos = new ArrayList<>();
        screeningRooms.forEach(e -> {
            ScreeningRoomDto screeningRoomDto = new ScreeningRoomDto(
                    e.getRoomId(),
                    e.getCinemaNum(),
                    e.getRoomName(),
                    e.getSeatingCapacity()
            );
            screeningRoomDtos.add(screeningRoomDto);
        });
        return screeningRoomDtos;
    }

    @Override
    @Transactional
    public void createMovieRegister(AdminMovieRegisterDto adminMovieRegisterDto) {
        FilmControll filmControll = new FilmControll();
        filmControll.setCinemaNum(adminMovieRegisterDto.getCinemaNum());
        filmControll.setMovieNum(adminMovieRegisterDto.getMovieNum());
        filmControll.setRoomId(adminMovieRegisterDto.getRoomId());
        filmControll.setFilmTimeYear(adminMovieRegisterDto.getFilmTimeYear());
        filmControll.setFilmTimeMonth(adminMovieRegisterDto.getFilmTimeMonth());
        filmControll.setFilmTimeDay(adminMovieRegisterDto.getFilmTimeDay());
        filmControll.setFilmTimeHour(adminMovieRegisterDto.getFilmTimeHour());
        filmControll.setFilmTimeMinute(adminMovieRegisterDto.getFilmTimeMinute());

        filmControllRepository.save(filmControll);
    }

//    @Transactional
//    public void createMovieRegister(AdminMovieRegisterDto adminMovieRegisterDto) {
//        Optional<FilmControll> filmControll = filmControllRepository.findById(4);
//        filmControll.ifPresent(e->{
//            e.setCinemaNum(adminMovieRegisterDto.getCinemaNum());
//            e.setMovieNum(adminMovieRegisterDto.getMovieNum());
//            e.setRoomId(adminMovieRegisterDto.getRoomId());
//            e.setFilmTimeYearMonth(adminMovieRegisterDto.getFilmTimeYearMonth());
//            e.setFilmTimeHourMinute(adminMovieRegisterDto.getFilmTimeHourMinute());
//        });
//
//
//    }
    @Override
    @Transactional
    public void updateMovieFix(AdminMovieRegisterDto adminMovieRegisterDto) {
        FilmControll filmControll = new FilmControll();
        filmControll.setCinemaNum(adminMovieRegisterDto.getCinemaNum());
        filmControll.setMovieNum(adminMovieRegisterDto.getMovieNum());
        filmControll.setRoomId(adminMovieRegisterDto.getRoomId());
        filmControll.setFilmTimeYear(adminMovieRegisterDto.getFilmTimeYear());
        filmControll.setFilmTimeMonth(adminMovieRegisterDto.getFilmTimeMonth());
        filmControll.setFilmTimeDay(adminMovieRegisterDto.getFilmTimeDay());
        filmControll.setFilmTimeHour(adminMovieRegisterDto.getFilmTimeHour());
        filmControll.setFilmTimeMinute(adminMovieRegisterDto.getFilmTimeMinute());

        filmControllRepository.save(filmControll);
    }

}
