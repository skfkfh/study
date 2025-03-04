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
@RequiredArgsConstructor
@Table(name = "filmControll")
public class FilmControll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FILM_NO")
    private Integer filmNo;
    @Column(name = "CINEMA_NUM")
    private Integer cinemaNum;
    @Column(name = "MOVIE_NUM")
    private Integer movieNum;
    @Column(name = "ROOM_ID")
    private Integer roomId;
    @Column(name = "FILMTIME_YEAR")
    private String filmTimeYear;
    @Column(name = "FILMTIME_MONTH")
    private String filmTimeMonth;
    @Column(name = "FILMTIME_DAY")
    private String filmTimeDay;
    @Column(name = "FILMTIME_HOUR")
    private String filmTimeHour;
    @Column(name = "FILMTIME_MINUTE")
    private String filmTimeMinute;

}
