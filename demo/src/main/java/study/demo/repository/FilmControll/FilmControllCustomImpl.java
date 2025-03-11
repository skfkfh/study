package study.demo.repository.FilmControll;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import study.demo.dto.CinemaDto;
import study.demo.dto.QCinemaDto;
import study.demo.dto.MovieDto;
import study.demo.dto.QMovieDto;

import static study.demo.entity.QCinema.cinema;
import static study.demo.entity.QFilmControll.filmControll;
import static study.demo.entity.QMovie.movie;


import java.util.List;

@RequiredArgsConstructor
public class FilmControllCustomImpl implements FilmControllCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public List<MovieDto> getMovieList(String yyyy,String mm, String day, String hour){

        return jpaQueryFactory
                .select(
                        new QMovieDto(
                                filmControll.movieNum,
                                movie.movieTitle,
                                movie.movieCost,
                                movie.movieAge
                        )
                )
                .from(filmControll)
                .leftJoin(movie).on(movie.movieNum.eq(filmControll.movieNum))
                .where(
                        filmControll.filmTimeYear.goe(yyyy),
                        filmControll.filmTimeMonth.goe(mm),
                        filmControll.filmTimeDay.goe(day),
                        filmControll.filmTimeHour.goe(hour)
                )
                .distinct()
                .fetch();

    }

    public List<CinemaDto> getCinemaList(String yyyy,String mm,String day,String hour) {

        return jpaQueryFactory
                .select(
                        new QCinemaDto(
                                filmControll.cinemaNum,
                                cinema.cinemaName
                        )
                )
                .from(filmControll)
                .leftJoin(cinema).on(filmControll.cinemaNum.eq(cinema.cinemaNum))
                .where(
                        filmControll.filmTimeYear.goe(yyyy),
                        filmControll.filmTimeMonth.goe(mm),
                        filmControll.filmTimeDay.goe(day),
                        filmControll.filmTimeHour.goe(hour)
                )
                .distinct()
                .fetch();

    }

}

