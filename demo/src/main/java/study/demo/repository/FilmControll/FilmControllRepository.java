package study.demo.repository.FilmControll;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.entity.FilmControll;

public interface FilmControllRepository extends JpaRepository<FilmControll, Integer>,FilmControllCustom {


}
