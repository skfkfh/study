package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.CinemaDto;

@Service
public interface CinemaService {

    CinemaDto getCinemaInfoById(Integer id);
}
