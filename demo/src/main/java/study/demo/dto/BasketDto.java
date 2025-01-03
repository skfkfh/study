package study.demo.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
public class BasketDto {

    private String userId;
    private String basketMovieTitle;
    private Integer basketUserAge;
    private Integer basketMovieNum;
}
