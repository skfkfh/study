package study.demo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class BasketDto {
    private Integer basketNo;
    private String userId;
    private String basketMovieTitle;
    private Integer basketMovieNum;
    private String userName;


    @QueryProjection
    public BasketDto(Integer basketNo, String userId, String basketMovieTitle, Integer basketMovieNum) {
        this.basketNo = basketNo;
        this.userId = userId;
        this.basketMovieTitle = basketMovieTitle;
        this.basketMovieNum = basketMovieNum;
    }

    @QueryProjection
    public BasketDto(Integer basketNo, String userId, String basketMovieTitle, Integer basketMovieNum, String userName) {
        this.basketNo = basketNo;
        this.userId = userId;
        this.basketMovieTitle = basketMovieTitle;
        this.basketMovieNum = basketMovieNum;
        this.userName = userName;
    }
}
