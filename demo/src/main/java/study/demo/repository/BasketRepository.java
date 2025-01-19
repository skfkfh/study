package study.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.demo.entity.Basket;

public interface BasketRepository extends JpaRepository<Basket, String> {
}
