package study.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.entity.SeatBook;

public interface SeatBookRepository extends JpaRepository<SeatBook, String> {
}
