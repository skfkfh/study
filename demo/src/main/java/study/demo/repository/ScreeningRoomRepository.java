package study.demo.repository;


import org.springframework.data.repository.CrudRepository;
import study.demo.entity.ScreeningRoom;

public interface ScreeningRoomRepository extends CrudRepository<ScreeningRoom, Integer> {
}
