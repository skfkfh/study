package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.MovieDto;
import study.demo.entity.Movie;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {

    List<Movie> getMovieInfo(String movieTitle);

    Optional<MovieDto> getMovieInfoByNum(Integer movieNum);
}
