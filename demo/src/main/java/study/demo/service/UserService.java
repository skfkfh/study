package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.UserDto;
import study.demo.entity.User;

import java.util.List;

@Service
public interface UserService {


    UserDto getUserDetail(String userId);

    UserDto updateUserDetail(UserDto userDto, String userId);
}
