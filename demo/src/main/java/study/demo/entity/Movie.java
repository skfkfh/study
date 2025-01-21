package study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "movie")
public class Movie {

    @Id
    @Column(name = "MOVIE_NUM")
    private Integer movieNum;

    @Column(name = "MOVIE_NAME")
    private String movieName;

    @Column(name = "MOVIE_COST")
    private Integer movieCost;

}
