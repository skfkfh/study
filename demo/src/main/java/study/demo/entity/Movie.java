package study.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "MOVIE_AGE")
    private Integer movieAge;

}
