package study.demo.service;

import org.springframework.stereotype.Service;
import study.demo.dto.ScreeningRoomDto;

import java.util.List;

@Service
public interface ScreeningRoomService {

    List<ScreeningRoomDto> getScreeningRoomsByCinemaNum(Integer cinemaNum);
}
