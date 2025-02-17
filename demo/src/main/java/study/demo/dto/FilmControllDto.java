package study.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class FilmControllDto {

    private Integer filmNo;
    private Integer cinemaNum;
    private Integer movieNum;
    private Integer roomId;
    private LocalDateTime filmTime;
}
