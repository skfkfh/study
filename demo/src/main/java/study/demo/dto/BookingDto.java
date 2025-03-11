package study.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingDto {

    private String userId;

    private Integer filmNo;

    private Integer bookAmount;

    private String bookingHour;

    private String bookingMinute;



}
