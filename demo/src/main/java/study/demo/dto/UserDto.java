package study.demo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class UserDto {

    private String userId;
    private String userPwd;
    private String userName;
    private Integer userPhoneNum;
    private String userAdd;
    private Integer userAge;

    @QueryProjection
    public UserDto(String userId, String userPwd, String userName, Integer userPhoneNum, String userAdd, Integer userAge) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.userPhoneNum = userPhoneNum;
        this.userAdd = userAdd;
        this.userAge = userAge;
    }
}
