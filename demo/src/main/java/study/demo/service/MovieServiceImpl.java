package study.demo.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.MovieDto;
import study.demo.entity.Movie;
import study.demo.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getMovieInfo(String movieTitle) {

        return movieRepository.findAllByTitle(movieTitle);
    }

    @Override
    public Optional<MovieDto> getMovieInfoByNum(Integer movieNum) {

        return movieRepository.findById(movieNum)
                .map(MovieDto::toDto);
    }
}
