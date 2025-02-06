package study.demo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.UserDto;
import study.demo.entity.User;
import study.demo.repository.User.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserDto getUserDetail(String userId) {

        User user = userRepository.findById(userId).orElse(null);
        UserDto userDto = new UserDto(user.getUserId(),
                user.getUserPwd(),
                user.getUserName(),
                user.getUserPhoneNum(),
                user.getUserAdd(),
                user.getUserAge());

        return userDto;
    }

    @Override
    @Transactional
    public UserDto updateUserDetail(UserDto userDto, String userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        user.setUserPwd(user.getUserPwd());
        user.setUserName(user.getUserName());
        user.setUserPhoneNum(user.getUserPhoneNum());
        user.setUserAdd(user.getUserAdd());
        user.setUserAge(user.getUserAge());

        User savedUser = userRepository.save(user);

        UserDto saveUserDto = new UserDto(savedUser.getUserPwd(),
                savedUser.getUserName(),
                savedUser.getUserPhoneNum(),
                savedUser.getUserAdd(),
                savedUser.getUserAge());

        return saveUserDto;
    }
}
