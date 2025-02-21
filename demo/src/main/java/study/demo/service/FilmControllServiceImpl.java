package study.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.FilmControllDto;
import study.demo.entity.FilmControll;
import study.demo.repository.FilmControllRepository;

@Service
@RequiredArgsConstructor
public class FilmControllServiceImpl implements FilmControllService {

    private final FilmControllRepository filmControllRepository;

    @Override
    public FilmControllDto findFilmByMovieTitle(String movieTitle) {
        FilmControll filmControll = filmControllRepository.findFilmByMovieTitle(movieTitle);
        FilmControllDto filmControllDto = new FilmControllDto(
                filmControll.getFilmNo(),
                filmControll.getCinemaNum(),
                filmControll.getMovieTitle(),
                filmControll.getRoomName(),
                filmControll.getFilmTimeYearMonth(),
                filmControll.getFilmTimeHourMinute()
        );
        return filmControllDto;

    }

    @Override
    public FilmControllDto findFilmByCinemaNum(Integer cinemaNum) {
        FilmControll filmControll = filmControllRepository.findByCinemaNum(cinemaNum);
        FilmControllDto filmControllDto = new FilmControllDto(
                filmControll.getFilmNo(),
                filmControll.getCinemaNum(),
                filmControll.getMovieTitle(),
                filmControll.getRoomName(),
                filmControll.getFilmTimeYearMonth(),
                filmControll.getFilmTimeHourMinute()
        );
        return filmControllDto;
    }

    @Override
    public FilmControllDto createFilm(FilmControllDto filmControllDto) {
        FilmControll filmControll = new FilmControll(
                filmControllDto.getCinemaNum(),
                filmControllDto.getMovieTitle(),
                filmControllDto.getRoomName(),
                filmControllDto.getFilmTimeYearMonth(),
                filmControllDto.getFilmTimeHourMinute()
        );

        filmControll = filmControllRepository.save(filmControll);

        FilmControllDto filmControllDto2 = new FilmControllDto(
                filmControll.getFilmNo(),
                filmControll.getCinemaNum(),
                filmControll.getMovieTitle(),
                filmControll.getRoomName(),
                filmControll.getFilmTimeYearMonth(),
                filmControll.getFilmTimeHourMinute()
        );
        return filmControllDto2;
    }
}
