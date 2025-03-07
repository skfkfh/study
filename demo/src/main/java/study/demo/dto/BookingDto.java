package study.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingDto {

    //어떻게 추가하는지?
    private String userId;

    private Integer movieNum;

    private Integer cinemaNum;

    private Integer roomId;

    private Integer bookAmount;

    // 올해,해당 월 고정

    private String filmTimeHour;

    private String filmTimeMinute;

}
