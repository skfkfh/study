package study.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "filmControll")
public class FilmControll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FILM_NO")
    private Integer filmNo;
    @Column(name = "CINEMA_NUM")
    private Integer cinemaNum;
    @Column(name = "MOVIE_TITLE")
    private String movieTitle;
    @Column(name = "ROOM_NAME")
    private String roomName;
    @Column(name = "FILMTIME_YEARMONTH")
    private String filmTimeYearMonth;
    @Column(name = "FILMTIME_HOURMINUTE")
    private String filmTimeHourMinute;

    public FilmControll(Integer cinemaNum, String movieTitle, String roomName, String filmTimeYearMonth, String filmTimeHourMinute) {
        this.cinemaNum = cinemaNum;
        this.movieTitle = movieTitle;
        this.roomName = roomName;
        this.filmTimeYearMonth = filmTimeYearMonth;
        this.filmTimeHourMinute = filmTimeHourMinute;
    }
}
