package study.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.dto.MovieDto;
import study.demo.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

   List<Movie> findAllByTitle(String movieTitle);

}
