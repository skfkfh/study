package study.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import study.demo.entity.Movie;

@Data
@AllArgsConstructor
public class MovieDto {

    private Integer movieNum;
    private String movieTitle;
    private Integer movieCost;
}