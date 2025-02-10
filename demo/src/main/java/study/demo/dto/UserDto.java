package study.demo.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String userId;
    private String userPwd;
    private String userName;
    private String userPhoneNum;
    private String userAdd;
    private Integer userAge;

    public UserDto(String userPwd, String userName, String userPhoneNum, String userAdd, Integer userAge) {
    }
}
