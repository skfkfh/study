package study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "basket")
public class Basket {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "BASKET_MOVIE_TITLE")
    private String basketMovieTitle;

    @Column(name = "BASKET_USER_AGE")
    private Integer basketUserAge;

    @Column(name = "BASKET_MOVIE_NUM")
    private Integer basketMovieNum;
}