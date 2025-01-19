package study.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
}
