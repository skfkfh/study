package study.demo.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.MovieDto;
import study.demo.entity.Movie;
import study.demo.repository.MovieRepository;


@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{
    private final MovieRepository movieRepository;

    @Override
    public MovieDto getMovieInfo(String movieTitle) {
        Movie movie = movieRepository.findByMovieTitle(movieTitle);
        MovieDto movieDto = new MovieDto(
                movie.getMovieNum(),
                movie.getMovieTitle(),
                movie.getMovieCost(),
                movie.getMovieAge());

        return movieDto;
    }

    @Override
    public MovieDto getMovieInfoByNum(Integer movieNum) {

        Movie movie = movieRepository
                .findById(movieNum)
                .orElseThrow(() -> new EntityNotFoundException("Num doesn't exist"));
        MovieDto movieDto = new MovieDto(
                movie.getMovieNum(),
                movie.getMovieTitle(),
                movie.getMovieCost(),
                movie.getMovieAge());

        return movieDto;
    }
}

