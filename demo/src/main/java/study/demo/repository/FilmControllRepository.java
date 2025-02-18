package study.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.entity.FilmControll;

public interface FilmControllRepository extends JpaRepository<FilmControll, Integer> {

    FilmControll findByMovieNum(Integer movieNum);

    FilmControll findByCinemaNum(Integer cinemaNum);

}
