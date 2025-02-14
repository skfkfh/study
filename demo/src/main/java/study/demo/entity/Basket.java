package study.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "basket")
public class Basket {

    @EmbeddedId
    private BasketId id;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "BASKET_NO")
//    private Integer basketNo;
//
//    @Id
//    @Column(name = "USER_ID")
//    private String userId;

    @Column(name = "BASKET_MOVIE_TITLE")
    private String basketMovieTitle;

    @Column(name = "BASKET_USER_AGE")
    private Integer basketUserAge;

    @Column(name = "BASKET_MOVIE_NUM")
    private Integer basketMovieNum;
}