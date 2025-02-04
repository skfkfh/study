package study.demo.repository.User;

import study.demo.dto.UserDto;

import java.util.List;

public interface UserCustom {

    List<UserDto> getUserDetail(String userId);
}
