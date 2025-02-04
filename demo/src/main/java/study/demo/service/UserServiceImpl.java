package study.demo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.UserDto;
import study.demo.entity.User;
import study.demo.repository.User.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public List<UserDto> getUserDetail(String userId) {
        return userRepository.getUserDetail(userId);
    }

    @Override
    public List<UserDto> updateUserDetail(UserDto userDto,String userId) {
        List<UserDto> users = userRepository.getUserDetail(userId);

        for (UserDto user : users) {
            user.setUserPwd(user.getUserPwd());
            user.setUserName(user.getUserName());
            user.setUserPhoneNum(user.getUserPhoneNum());
            user.setUserAdd(user.getUserAdd());
            user.setUserAge(user.getUserAge());
        }
        return users;
    }
}
