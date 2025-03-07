package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.demo.dto.UserSignUpDto;
import study.demo.service.UserService;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/detail")
    public UserSignUpDto getUserDetail(@RequestParam String userId) {
        return userService.getUserDetail(userId);
    }
    @PostMapping("/signup")
    public UserSignUpDto signUpUser(@RequestBody UserSignUpDto userDto) {
        if (!signUpUser(userDto).getUserPwd().equals(signUpUser(userDto).getUserPwdCheck())) {
            return userDto;
        }

        return userService.signUpUser(userDto);
    }

    @PutMapping("/update")
    public UserSignUpDto updateUser(@RequestBody UserSignUpDto userDto, String userId) {
        return userService.updateUserDetail(userDto,userId);
    }
}
