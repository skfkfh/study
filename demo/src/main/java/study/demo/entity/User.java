package study.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @Column(name = "USER_ID", unique = true, nullable = false)
    private String userId;

    @Column(name = "USER_PWD")
    private String userPwd;

    @Column(name = "USER_PWD_CHECK")
    private String userPwdCheck;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PHONE_NUM")
    private String userPhoneNum;

    @Column(name = "USER_BIRTH")
    private Integer userBirth;

    @Column(name = "USER_ADD")
    private String userAdd;

    @Column(name = "USER_EMAIL",unique = true)
    private String userEmail;

    @Column(name = "USER_SEX")
    private String userSex;

}
