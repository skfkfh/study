package study.demo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.UserSignUpDto;
import study.demo.entity.User;
import study.demo.repository.User.UserRepository;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserSignUpDto getUserDetail(String userId) {

        User user = userRepository.findById(userId).orElse(null);
        UserSignUpDto userDto = new UserSignUpDto(
                user.getUserName(),
                user.getUserId(),
                user.getUserBirth(),
                user.getUserPhoneNum(),
                user.getUserAdd(),
                user.getUserEmail(),
                user.getUserSex());

        return userDto;
    }

    @Override
    @Transactional
    public UserSignUpDto signUpUser(UserSignUpDto userDto) {
        User user = new User();

        user.setUserPwd(userDto.getUserPwd());
        user.setUserPwdCheck(userDto.getUserPwdCheck());
        user.setUserName(userDto.getUserName());
        user.setUserPhoneNum(userDto.getUserPhoneNum());
        user.setUserAdd(userDto.getUserAdd());
        user.setUserBirth(userDto.getUserBirth());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserSex(userDto.getUserSex());

        userRepository.save(user);

        return userDto;
    }

    @Override
    @Transactional
    public UserSignUpDto updateUserDetail(UserSignUpDto userDto, String userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        user.setUserPwd(userDto.getUserPwd());
        user.setUserPwdCheck(userDto.getUserPwdCheck());
        user.setUserName(userDto.getUserName());
        user.setUserPhoneNum(userDto.getUserPhoneNum());
        user.setUserAdd(userDto.getUserAdd());
        user.setUserBirth(userDto.getUserBirth());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserSex(userDto.getUserSex());

        User savedUser = userRepository.save(user);

        UserSignUpDto saveUserDto = new UserSignUpDto(
                savedUser.getUserPwd(),
                savedUser.getUserPwdCheck(),
                savedUser.getUserName(),
                savedUser.getUserPhoneNum(),
                savedUser.getUserAdd(),
                savedUser.getUserBirth(),
                savedUser.getUserEmail(),
                savedUser.getUserSex());

        return saveUserDto;
    }
}
