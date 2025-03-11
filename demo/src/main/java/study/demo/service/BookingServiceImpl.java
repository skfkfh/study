package study.demo.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.BookingDto;
import study.demo.dto.CinemaDto;
import study.demo.dto.MovieDto;
import study.demo.dto.SeatChoiceDto;
import study.demo.entity.SeatBook;
import study.demo.entity.UserBook;
import study.demo.repository.*;
import study.demo.repository.FilmControll.FilmControllRepository;
import study.demo.util.DateUtil;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService{

    private final UserBookRepository userBookRepository;
    private final FilmControllRepository filmControllRepository;
    private final SeatBookRepository seatBookRepository;
    public DateUtil dateUtil = new DateUtil();

    @Override
    public List<MovieDto> getMovieList() {
        List<String> dateList = dateUtil.getDateYyyyMmDdHhMm();

        return filmControllRepository.getMovieList(
                dateList.get(0),
                dateList.get(1),
                dateList.get(2),
                dateList.get(3)
        );
    }

    @Override
    public List<CinemaDto> getCinemaList() {
        List<String> dateList = dateUtil.getDateYyyyMmDdHhMm();
        return filmControllRepository.getCinemaList(
                dateList.get(0),
                dateList.get(1),
                dateList.get(2),
                dateList.get(3)
        );
    }

    @Override
    @Transactional
    public void choiceSeat(SeatChoiceDto seatChoiceDto) {
        SeatBook seatBook = new SeatBook();
        List<String> dateList = dateUtil.getDateYyyyMmDdHhMm();

        seatBook.setUserId(seatChoiceDto.getUserId());
        seatBook.setFilmNo(seatChoiceDto.getFilmNo());
        seatBook.setSeatWhereList(seatChoiceDto.getSeatWhere());
        seatBook.setSeatBookHour(dateList.get(3));
        seatBook.setSeatBookMinute(dateList.get(4));

        seatBookRepository.save(seatBook);
    }

    @Override
    @Transactional
    public void bookMovie(BookingDto bookingDto) {
        UserBook userBook = new UserBook();
        List<String> dateList = dateUtil.getDateYyyyMmDdHhMm();

        userBook.setUserId(bookingDto.getUserId());
        userBook.setFilmNo(bookingDto.getFilmNo());
        userBook.setBookAmount(bookingDto.getBookAmount());
        userBook.setBookingHour(dateList.get(3));
        userBook.setBookingMinute(dateList.get(4));

        userBookRepository.save(userBook);
    }


}
