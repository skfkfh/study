package study.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.MovieDto;
import study.demo.entity.Movie;
import study.demo.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MainCinemaViewServiceImpl implements MainCinemaViewService {

    private final MovieRepository movieRepository;


    @Override
    public List<MovieDto> getMainMovieList() {
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

}
