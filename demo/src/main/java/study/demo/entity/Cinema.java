package study.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cinema")
public class Cinema {

    @Id
    @Column(name = "CINEMA_NUM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cinemaNum;

    @Column(name = "CINEMA_NAME")
    private String cinemaName;

    @Column(name = "CINEMA_TEL")
    private Integer cinemaTel;

    @Column(name = "CINEMA_ADD")
    private String cinemaAdd;

}
