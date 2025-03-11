package study.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SEAT_BOOK")
public class SeatBook {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "FILM_NO")
    private Integer filmNo;

    @Column(name = "SEAT_WHERE")
    private String seatWhere;

    @Column(name = "SEAT_STATUS")
    private String seatStatus;

    @Column(name = "SEAT_BOOK_HOUR")
    private String seatBookHour;

    @Column(name = "SEAT_BOOK_MINUTE")
    private String seatBookMinute;


    public List<String> getSeatWhereList() {
        return seatWhere != null ? Arrays.asList(seatWhere.split(",")) : new ArrayList<>();
    }

    public void setSeatWhereList(List<String> seatList) {
        this.seatWhere = seatList != null ? String.join(",", seatList) : null;
    }
}
