package study.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.ScreeningRoomDto;
import study.demo.entity.ScreeningRoom;
import study.demo.repository.ScreeningRoomRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScreeningRoomServiceImpl implements ScreeningRoomService {

    private final ScreeningRoomRepository screeningRoomRepository;

    @Override
    public List<ScreeningRoomDto> getScreeningRoomsByCinemaNum(Integer cinemaNum) {
        List<ScreeningRoomDto> screeningRoom = screeningRoomRepository.findByCinemaNum(cinemaNum);
        return screeningRoom;
    }

}
