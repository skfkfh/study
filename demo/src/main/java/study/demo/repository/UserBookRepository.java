package study.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.entity.UserBook;

public interface UserBookRepository extends JpaRepository<UserBook, String> {


}
