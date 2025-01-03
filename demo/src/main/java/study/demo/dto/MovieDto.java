package study.demo.dto;

import lombok.Data;

@Data
public class MovieDto {

    private Integer movieNum;
    private String movieTitle;
    private Integer movieCost;
    private Integer movieGoer;
    private String movieCinema;
}
