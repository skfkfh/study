package study.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScreeningRoomDto {

    private Integer roomId;
    private Integer cinemaNum;
    private String roomName;
    private Integer seatingCapacity;
}
