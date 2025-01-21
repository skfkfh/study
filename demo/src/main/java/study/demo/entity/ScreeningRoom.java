package study.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "screening_room")
public class ScreeningRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "CINEMA_NUM")
    private Integer cinemaNum;

    @Column(name = "ROOM_NAME")
    private String roomName;

    @Column(name = "SEATING_CAPACITY")
    private Integer seatingCapacity;
}
