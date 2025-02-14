package study.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.demo.dto.CinemaDto;
import study.demo.entity.Cinema;
import study.demo.repository.CinemaRepository;

@Service
@RequiredArgsConstructor
public class CinemaServiceImpl implements CinemaService{

    private final CinemaRepository cinemaRepository;

    @Override
    public CinemaDto getCinemaInfoById(Integer id) {

        Cinema cinema = cinemaRepository.findById(id).orElse(null);
        CinemaDto cinemaDto = new CinemaDto(
                cinema.getCinemaNum(),
                cinema.getCinemaName(),
                cinema.getCinemaTel(),
                cinema.getCinemaAdd()
        );

        return cinemaDto;
    }
}
