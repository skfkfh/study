package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.UserSignUpDto;

@Service
public interface UserService {


    UserSignUpDto getUserDetail(String userId);

    UserSignUpDto updateUserDetail(UserSignUpDto userDto, String userId);

    UserSignUpDto signUpUser(UserSignUpDto userDto);
}
