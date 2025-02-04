package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.UserDto;
import study.demo.entity.User;
import study.demo.repository.User.UserRepository;

import java.util.List;

@Service
public interface UserService {


    List<UserDto> getUserDetail(String userId);

    List<UserDto> updateUserDetail(UserDto userDto,String userId);
}
