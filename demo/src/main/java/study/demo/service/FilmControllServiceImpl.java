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

    public FilmControllDto findFilmByMovieNum(Integer movieNum) {
        FilmControll filmControll = filmControllRepository.findByMovieNum(movieNum);
        FilmControllDto filmControllDto = new FilmControllDto(
                filmControll.getFilmNo(),
                filmControll.getCinemaNum(),
                filmControll.getMovieNum(),
                filmControll.getRoomId(),
                filmControll.getFilmTime()
        );
        return filmControllDto;

    }
}
