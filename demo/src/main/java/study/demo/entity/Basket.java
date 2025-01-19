package study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Basket {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "BASKET_MOVIE_TITLE")
    private String basketMoiveTitle;

    @Column(name = "BASKET_USER_AGE")
    private Integer basketUserAge;

    @Column(name = "BASKET_MOVIE_NUM")
    private Integer basketMovieNum;
}