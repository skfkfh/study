package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.demo.dto.UserDto;
import study.demo.entity.User;
import study.demo.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/detail")
    public List<UserDto> getUserDetail(@RequestParam String userId) {
        return userService.getUserDetail(userId);
    }

    @PutMapping("/update")
    public List<UserDto> updateUser(@RequestBody UserDto userDto,String userId) {
        return userService.updateUserDetail(userDto,userId);
    }

}
