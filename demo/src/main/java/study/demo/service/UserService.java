package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.entity.User;

@Service
public interface UserService {


    User getUserDetail(String userId);

    User updateUser(User user);
}
