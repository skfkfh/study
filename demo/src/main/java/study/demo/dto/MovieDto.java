package study.demo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Data;
import study.demo.entity.Movie;

@Data
public class MovieDto {

    private Integer movieNum;
    private String movieTitle;
    private Integer movieCost;
    private Integer movieAge;

    @QueryProjection
    public MovieDto(Integer movieNum, String movieTitle, Integer movieCost, Integer movieAge) {
        this.movieNum = movieNum;
        this.movieTitle = movieTitle;
        this.movieCost = movieCost;
        this.movieAge = movieAge;
    }
}