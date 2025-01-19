package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.demo.entity.User;
import study.demo.service.UserService;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/detail")
    public User getUserDetail(@RequestParam String userId) {
        return userService.getUserDetail(userId);
    }

    @PutMapping("/info")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
