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

    @Column(name = "FILM_NO")
    private Integer filmNo;

    @Column(name = "BOOK_AMOUNT")
    private Integer bookAmount;

    @Column(name = "BOOKING_HOUR")
    private String bookingHour;

    @Column(name = "BOOKING_MINUTE")
    private String bookingMinute;
}
