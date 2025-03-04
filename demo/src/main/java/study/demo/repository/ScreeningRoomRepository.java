package study.demo.repository;


import org.springframework.data.repository.CrudRepository;
import study.demo.dto.ScreeningRoomDto;
import study.demo.entity.ScreeningRoom;

import java.util.List;

public interface ScreeningRoomRepository extends CrudRepository<ScreeningRoom, Integer> {

    List<ScreeningRoom> findByCinemaNum(Integer cinemaNum);
}
