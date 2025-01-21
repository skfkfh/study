package study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cinema")
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

}
