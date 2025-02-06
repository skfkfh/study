package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.demo.dto.ScreeningRoomDto;
import study.demo.service.ScreeningRoomService;

import java.util.List;

@RestController
@RequestMapping("/screeningRoom")
@RequiredArgsConstructor
public class ScreeningRoomController {

    private final ScreeningRoomService screeningRoomService;

    @GetMapping("/info")
    public List<ScreeningRoomDto> getScreeningRoomsByCinemaNum(Integer cinemaNum) {
        return screeningRoomService.getScreeningRoomsByCinemaNum(cinemaNum);
    }
}
