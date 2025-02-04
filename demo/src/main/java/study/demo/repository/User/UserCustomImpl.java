package study.demo.repository.User;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import study.demo.dto.QUserDto;
import study.demo.dto.UserDto;


import static study.demo.entity.QUser.user;

import java.util.List;

@RequiredArgsConstructor
public class UserCustomImpl implements UserCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public List<UserDto> getUserDetail(String userId) {

        return jpaQueryFactory
                .select(
                        new QUserDto(
                                user.userId,
                                user.userPwd,
                                user.userName,
                                user.userPhoneNum,
                                user.userAdd,
                                user.userAge
                        )
                )
                .from(user)
                .where(user.userId.eq(userId))
                .fetch();

    }
}
