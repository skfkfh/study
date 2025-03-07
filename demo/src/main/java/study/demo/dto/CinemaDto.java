package study.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CinemaDto {

    private Integer cinemaNum;
    private String cinemaName;
    private Integer cinemaTel;
    private String cinemaAdd;

    public CinemaDto(Integer cinemaNum, String cinemaName) {
    }
}
