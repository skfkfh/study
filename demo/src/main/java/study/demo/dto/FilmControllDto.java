package study.demo.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmControllDto {

    private Integer filmNo;
    private Integer cinemaNum;
    private String movieTitle;
    private String roomName;
    private String filmTimeYearMonth;
    private String filmTimeHourMinute;


    public FilmControllDto(Integer cinemaNum, String movieTitle, String roomName, String filmTimeYearMonth, String filmTimeHourMinute) {
        this.cinemaNum = cinemaNum;
        this.movieTitle = movieTitle;
        this.roomName = roomName;
        this.filmTimeYearMonth = filmTimeYearMonth;
        this.filmTimeHourMinute = filmTimeHourMinute;
    }
}
