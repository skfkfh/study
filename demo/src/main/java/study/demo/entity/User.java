package study.demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_PWD")
    private String userPwd;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PHONE_NUM")
    private Integer userPhoneNum;

    @Column(name = "USER_ADD")
    private String userAdd;

    @Column(name = "USER_AGE")
    private Integer userAge;
}
