package study.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "movie")
public class Movie {

    @Id
    @Column(name = "MOVIE_NUM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieNum;

    @Column(name = "MOVIE_TITLE")
    private String movieTitle;

    @Column(name = "MOVIE_COST")
    private Integer movieCost;

}
