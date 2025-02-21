package study.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "basket")
public class Basket {

    @EmbeddedId
    private BasketId id;

    @Column(name = "BASKET_MOVIE_TITLE")
    private String basketMovieTitle;


    @Column(name = "BASKET_MOVIE_NUM")
    private Integer basketMovieNum;
}