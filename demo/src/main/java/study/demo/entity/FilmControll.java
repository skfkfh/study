package study.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
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
    @Column(name = "FILM_TIME")
    private LocalDateTime filmTime;
}
