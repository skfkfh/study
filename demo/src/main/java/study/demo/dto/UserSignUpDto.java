package study.demo.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSignUpDto {

    @NotEmpty(message = "사용자 이름은 필수 항목 입니다.")
    private String userName;
    @Size(min = 2, max = 10)
    @NotEmpty(message = "사용자 ID는 필수 항목 입니다.")
    private String userId;
    @NotEmpty(message = "사용자 비밀번호는 필수 항목 입니다.")
    private String userPwd;
    @NotEmpty(message = "사용자 비밀번호 확인은 필수 항목 입니다.")
    private String userPwdCheck;
    @NotEmpty(message = "사용자 생년월일은 필수 항목 입니다.")
    private Integer userBirth;
    @NotEmpty(message = "사용자 연락처는 필수 항목 입니다.")
    private String userPhoneNum;
    @NotEmpty(message = "사용자 주소는 필수 항목 입니다.")
    private String userAdd;
    @NotEmpty
    private String userEmail;
    @NotEmpty(message = "성별을 선택해 주세요.")
    private String userSex;

    public UserSignUpDto(String userPwd, String userPwdCheck, String userName, String userPhoneNum, String userAdd, Integer userBirth, String userEmail, String userSex) {
    }

    public UserSignUpDto(String userName, String userId, String userPwd, Integer userBirth, String userPhoneNum, String userAdd, String userEmail, String userSex) {
    }

    public UserSignUpDto(String userName, String userId, Integer userBirth, String userPhoneNum, String userAdd, String userEmail, String userSex) {
    }
}
