package study.demo.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminMovieRegisterDto {

    private Integer cinemaNum;
    private Integer movieNum;
    private Integer roomId;
    private String filmTimeYear;
    private String filmTimeMonth;
    private String filmTimeDay;
    private String filmTimeHour;
    private String filmTimeMinute;


}
