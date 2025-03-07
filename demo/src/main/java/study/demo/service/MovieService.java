package study.demo.service;

import org.springframework.stereotype.Service;

import study.demo.dto.MovieDto;




@Service
public interface MovieService {
    MovieDto getMovieInfo(String movieTitle);

    MovieDto getMovieInfoByNum(Integer movieNum);

}