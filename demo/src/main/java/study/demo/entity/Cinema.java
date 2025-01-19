package study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cinema {

    @Id
    @Column(name = "CINEMA_NUM")
    private Integer cinemaNum;

    @Column(name = "CINEMA_NAME")
    private String cinemaName;

    @Column(name = "CINEMA_TEL")
    private Integer cinemaTel;

    @Column(name = "CINEMA_ADD")
    private String cinemaAdd;

    @Column(name = "CINEMA_SEAT")
    private Integer cinemaSeat;

    @Column(name = "CINEMA_PLAY_NUM")
    private Integer cinemaPlayNum;
}
