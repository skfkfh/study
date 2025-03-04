package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.AdminMovieRegisterDto;
import study.demo.dto.CinemaDto;
import study.demo.dto.MovieDto;
import study.demo.dto.ScreeningRoomDto;

import java.util.List;

@Service
public interface AdminMovieService {

    List<CinemaDto> getCinemaList();

    List<MovieDto> getMovieList();

    List<ScreeningRoomDto> getRoomList(Integer cinemaNum);

    void createMovieRegister(AdminMovieRegisterDto adminMovieRegisterDto);

    void updateMovieFix(AdminMovieRegisterDto adminMovieRegisterDto);
}