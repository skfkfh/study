package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.demo.dto.AdminMovieRegisterDto;
import study.demo.dto.CinemaDto;
import study.demo.dto.MovieDto;
import study.demo.dto.ScreeningRoomDto;
import study.demo.service.AdminMovieService;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/admin/movie")
@RequiredArgsConstructor
public class AdminMovieController {

    private final AdminMovieService adminMovieService;

    @GetMapping("/cinemaOption")
    public List<CinemaDto> getCinemaList() {
        return adminMovieService.getCinemaList();
    }

    @GetMapping("/movieOption")
    public List<MovieDto> getMovieList() {
        return adminMovieService.getMovieList();
    }

    @GetMapping("/roomOption")
    public List<ScreeningRoomDto> getRoomList(@RequestParam Integer cinemaNum) {
        return adminMovieService.getRoomList(cinemaNum);
    }

    @GetMapping("/years")
    public List<Integer> getYears() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Integer> years = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            years.add(currentYear + i);
        }
        return years;
    }
    @GetMapping("/months")
    public List<Integer> getMonths() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    }
    @GetMapping("/days")
    public List<Integer> getDays(@RequestParam int year, @RequestParam int month) {
        int lastDay = YearMonth.of(year, month).lengthOfMonth(); // 해당 연도의 해당 월의 마지막 날짜 자동 계산
        return IntStream.rangeClosed(1, lastDay).boxed().collect(Collectors.toList());
    }

    @GetMapping("/hours")
    public List<Integer> getHours() {
        return IntStream.rangeClosed(0, 23)  // ✅ 0~23까지 숫자 생성
                .boxed() // int -> Integer 변환
                .collect(Collectors.toList());
    }

    @GetMapping("/minutes")
    public List<Integer> getMinutes() {
        return List.of(00, 30);
    }

    @PostMapping("/register")
    public void createMovieRegister(@RequestBody AdminMovieRegisterDto adminMovieRegisterDto) {

        adminMovieService.createMovieRegister(adminMovieRegisterDto);
    }

    @PutMapping("/fix")
    public void updateMovieFix(@RequestBody AdminMovieRegisterDto adminMovieRegisterDto) {
        adminMovieService.updateMovieFix(adminMovieRegisterDto);
    }
}
