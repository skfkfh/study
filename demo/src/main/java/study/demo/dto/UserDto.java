package study.demo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

    private String userId;
    private String userPwd;
    private String userName;
    private Integer userPhoneNum;
    private String userAdd;
    private Integer userAge;

    public UserDto(String userPwd, String userName, Integer userPhoneNum, String userAdd, Integer userAge) {
    }
}
