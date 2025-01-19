package study.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.entity.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Integer> {
}
