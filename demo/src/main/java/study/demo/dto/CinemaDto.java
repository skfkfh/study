package study.demo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class CinemaDto {

    private Integer cinemaNum;
    private String cinemaName;
    private Integer cinemaTel;
    private String cinemaAdd;

    @QueryProjection
    public CinemaDto(Integer cinemaNum, String cinemaName) {
        this.cinemaNum = cinemaNum;
        this.cinemaName = cinemaName;
    }

    public CinemaDto(Integer cinemaNum, String cinemaName, Integer cinemaTel, String cinemaAdd) {
        this.cinemaNum = cinemaNum;
        this.cinemaName = cinemaName;
        this.cinemaTel = cinemaTel;
        this.cinemaAdd = cinemaAdd;
    }
}
