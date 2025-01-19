package study.demo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dao.UserDao;
import study.demo.entity.User;
import study.demo.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

//    private final UserDao userDao;
    private final UserRepository userRepository;

    public User getUserDetail(String userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElse(null);
    }

    @Transactional
    public User updateUser(User user) {
        Optional<User> findUser = userRepository.findById(user.getUserId());

        findUser.ifPresent(data -> {
            data.setUserName(user.getUserName());
            data.setUserAdd(user.getUserAdd());
            data.setUserAge(user.getUserAge());
            data.setUserPhoneNum(user.getUserPhoneNum());
            data.setUserPwd(user.getUserPwd());
        });

        return user;
    }
}
