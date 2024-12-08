package study.demo.controller;

import com.example.study.dto.StudyUserDto;
import com.example.study.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/member")
    public String getMember(){
        return testService.getMember();
    }

    @GetMapping("/jpaMember")
    public List<StudyUserDto> getJpaMember(){
        return testService.getJpaMember();
    }

//    @GetMapping("/jpaMember")
//    public List<StudyUser> getJpaMember(){
//        return testService.getJpaMember();
//    }
}
