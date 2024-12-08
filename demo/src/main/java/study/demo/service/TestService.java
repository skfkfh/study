package study.demo.service;

import com.example.study.dto.StudyUserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {
    String getMember();
    List<StudyUserDto> getJpaMember();
//    List<StudyUser> getJpaMember();
}
