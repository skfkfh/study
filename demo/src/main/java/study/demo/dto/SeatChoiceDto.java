package study.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class SeatChoiceDto {

    private String userId;

    private Integer filmNo;

    private boolean adult;

    private Integer howManyAdult;

    private boolean youth;

    private Integer howManyYouth;

    private List<String> seatWhere;

    private String seatBookHour;

    private String seatBookMinute;
}
