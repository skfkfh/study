package study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER_BOOK")
public class UserBook {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "MOVIE_NUM")
    private Integer movieNum;

    @Column(name = "CINEMA_NUM")
    private Integer cinemaNum;

    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "BOOK_AMOUNT")
    private Integer bookAmount;
}
